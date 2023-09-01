package org.gc.javaexpert.MiddlewareServer;

import org.gc.javaexpert.constant.IntegrationConstant;
import org.gc.javaexpert.dto.IntegrationResponse;
import org.gc.javaexpert.enums.ResponseStatus;
import org.gc.javaexpert.model.IntegrationRequest;
import org.gc.javaexpert.service.MiddlewareClient;
import org.gc.javaexpert.util.ConfigFileLoader;
import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

@RestController
@RequestMapping("/")
public class MiddlewareController {
	
	private ConfigFileLoader configFileLoader;

	@SuppressWarnings("unchecked")
	@PostMapping("/service")
	public IntegrationResponse hitAnotherService(@RequestBody IntegrationRequest integrationRequest) {

		JSONObject requestObj = new JSONObject();
		JSONObject responseObj = null;
		IntegrationResponse integrationResponse = new IntegrationResponse();

		requestObj.put(IntegrationConstant.INTEGRATION_TYPE, integrationRequest.getIntegrationType());
		requestObj.put(IntegrationConstant.SESSION_ID, integrationRequest.getSessionId());
		requestObj.put(IntegrationConstant.WORKITEM_NAME, integrationRequest.getWorkitemName());
		requestObj.put(IntegrationConstant.REQUEST_JSON, integrationRequest.getRequestJSON());

		responseObj = MiddlewareClient.call(requestObj);

		if (responseObj != null) {

			Gson g = new Gson();
			integrationResponse = g.fromJson(String.valueOf(responseObj), IntegrationResponse.class);

		} else {
			integrationResponse.setStatus(ResponseStatus.failure);
		}
		return integrationResponse;
	}
}

//if (responseObj != null) {
//	IntegrationResponse integrationResponse = new IntegrationResponse();
//	if ("success".equalsIgnoreCase(String.valueOf(responseObj.get("status")))) {
//		integrationResponse.setStatus(ResponseStatus.success);
//	} else {
//		integrationResponse.setStatus(ResponseStatus.failure);
//	}
//	integrationResponse.setMessage(String.valueOf(responseObj.get("message")));
//
//	JSONObject responseJSON = new JSONObject();
//
//	responseJSON = (JSONObject) responseObj.get("responseJSON");
//	integrationResponse.setResponseJSON(responseJSON);
//
//	return integrationResponse;
//}
