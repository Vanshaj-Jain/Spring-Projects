package prototypeDesignPattren;

public class Client {
	public static void main(String[] args)throws CloneNotSupportedException {
		NetworkConnection con = new NetworkConnection();
		con.setIp("192.168.148.25");
		con.setLoadData("this is network data");
		
		System.out.println(con);
		
		NetworkConnection con1;
		try {
			con1 = (NetworkConnection)con.clone();
			System.out.println(con1);
		}catch(CloneNotSupportedException ee) {
			ee.printStackTrace();
		}
		
	}
}
