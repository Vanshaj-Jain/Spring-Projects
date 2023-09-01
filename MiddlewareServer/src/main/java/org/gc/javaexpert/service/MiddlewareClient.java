package org.gc.javaexpert.service;



import java.io.DataInputStream;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

import org.gc.javaexpert.config.PropConfig;
import org.gc.javaexpert.util.ConfigFileLoader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;
//import org.json.simple.parser.JSONParser;

import com.google.gson.Gson;


@Service
public class MiddlewareClient {
	
	@Autowired
	private PropConfig propConfig;
	
	public static JSONObject call(JSONArray requestArray) {
		return callImpl( requestArray);	
	}
	
	public static JSONObject call(org.json.simple.JSONObject requestObject) {
		return callImpl( requestObject);
	}


	public static JSONObject callImpl(Object requestObject) {
		JSONObject responseObject = null;
		 Socket client = null;
		try {
//		
//			PropConfig propConfig2 = new PropConfig();
//			String serverIp = propConfig2.getMiddlewareServerIp();
//			int serverPort = Integer.parseInt(propConfig2.getMiddlewareServerPort());

			String serverIp = ConfigFileLoader.getProperty("MIDDLEWARE_SERVER_IP", "192.168.134.23");
		    int serverPort = Integer.parseInt(ConfigFileLoader.getProperty("MIDDLEWARE_SERVER_PORT", "8080"));
		    
			//System.out.println("serverIp"+serverIp +"        "+"serverport:"+serverPort);
			// TradeLogger.info("[Method - getDataFromCBSServer] serverIP : "+serverIp+"
			// serverPort : "+serverPort);
			client = new Socket(serverIp, serverPort);

			OutputStream outToServer = client.getOutputStream();
			// DataOutputStream out = new DataOutputStream(outToServer);
			ObjectOutputStream out = new ObjectOutputStream(outToServer);
			Gson gson = new Gson();
	         //String responseJSON = gson.toJson(requestObject);
	         //out.writeUTF(responseJSON);\
	         out.writeObject(requestObject);
	         InputStream inFromServer = client.getInputStream();
	         JSONParser parser = new JSONParser();
	         System.out.println();
	         DataInputStream in = new DataInputStream(inFromServer);
	         StringBuilder data = new StringBuilder();
			 boolean isDataLeft = true; 
			// TradeLogger.info("[Method - getDataFromCBSServer] Before adding into chunks : "+isDataLeft);
					while (true && isDataLeft) {
					//	TradeLogger.info("[Method - getDataFromCBSServer] After updating chunks : "+isDataLeft);	
						while(isDataLeft) {
							final int CHUNK_SIZE = 5 * 1024;
							final String END_RESP = "END_RESP";
							String readData = null;
							byte byteDataArr[] = new byte[CHUNK_SIZE];
							int readBytes = in.read(byteDataArr);
							if (readBytes > -1) {
								if(readBytes == byteDataArr.length) {
									readData = new String(byteDataArr);
								//	TradeLogger.info("[Method - getDataFromCBSServer] Byte array size : " + byteDataArr.length+"--read Data is"+readData);
								} else {
									byte newByteArr[] = new byte[readBytes];
									System.arraycopy(byteDataArr, 0, newByteArr, 0, newByteArr.length);
									readData = new String(newByteArr);
									//TradeLogger.info("[Method - getDataFromCBSServer] Byte array size in else block :" + newByteArr.length+"--else Read Data is"+readData);
								}
								//TradeLogger.info("[Method - getDataFromCBSServer] Byte read:" + readBytes);			
								if(readData.indexOf(END_RESP) > -1) {
									isDataLeft = false;
								} else {
									byteDataArr = null;
								}
								parseResponse(data, readData);
							} else {
								isDataLeft = false;
							}
						} // end of inner while
						//TradeLogger.info("[Method - getDataFromCBSServer] Byte Data::" + data.length()+"CBS Response JSON : "+data);
					}
				client.close();
				
				responseObject = (JSONObject) parser.parse(data.toString());
	      } catch (Exception e) {
	    	  responseObject = new JSONObject();
	    	  responseObject.put("status", "failure");
	    	  responseObject.put("responseMessage","Service is not available at this moment. Please try after sometime.");
	    	  responseObject.put("responseJSON",null);
	    	//  TradeLogger.error("[Method - getDataFromCBSServer] enter in catch block"+e);
	      }
		finally {
			try {
				client.close();
			} catch (Exception e) {
				//TradeLogger.error("[Method - getDataFromCBSServer] enter in finally block"+e);
			}  
		}
		return responseObject;  
	}
	
	private static void parseResponse(StringBuilder data, String readData) {
		final String START_RESP = "START_RESP";
		final String END_RESP = "END_RESP";
		if(readData.startsWith(START_RESP)) {
			readData = readData.substring(readData.indexOf(START_RESP) + START_RESP.length());
		}
		if (readData.indexOf(END_RESP) > -1) {
			readData = readData.substring(0, readData.indexOf(END_RESP));
		}		
		data.append(readData);
	}

	public static void parseJSONObject(JSONObject call) {
		
		
	}

}

