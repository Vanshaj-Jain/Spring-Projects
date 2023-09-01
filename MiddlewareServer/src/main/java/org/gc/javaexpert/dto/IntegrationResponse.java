package org.gc.javaexpert.dto;

import org.gc.javaexpert.enums.ResponseStatus;
import org.json.simple.JSONObject;


public class IntegrationResponse {

	private ResponseStatus status;
	private int responseCode;
	private String message;
	private JSONObject responseJSON;

	public ResponseStatus getStatus() {
		return status;
	}
       
	public void setStatus(ResponseStatus status) {
		this.status = status;
	}
	
	public int getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}

	public JSONObject getResponseJSON() {
		return responseJSON;
	}

	public void setResponseJSON(JSONObject responseJSON) {
		this.responseJSON = responseJSON;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}	

}

