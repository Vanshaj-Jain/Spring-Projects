package org.gc.javaexpert.model;

import org.json.simple.JSONObject;

public class IntegrationRequest {

	private String integrationType;
	private String sessionId;
	private String workitemName;
	private JSONObject requestJSON;

	public String getIntegrationType() {
		return integrationType;
	}

	public void setIntegrationType(String integrationType) {
		this.integrationType = integrationType;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getWorkitemName() {
		return workitemName;
	}

	public void setWorkitemName(String workitemName) {
		this.workitemName = workitemName;
	}

	public JSONObject getRequestJSON() {
		return requestJSON;
	}

	public void setRequestJSON(JSONObject requestJSON) {
		this.requestJSON = requestJSON;
	}

}
