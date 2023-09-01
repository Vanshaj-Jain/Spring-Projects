package org.gc.javaexpert.config;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@Configuration
//@PropertySources({ @PropertySource(value = "application.properties", ignoreResourceNotFound = false) })
@PropertySource("classpath:application.properties")
public class PropConfig implements InitializingBean {

	@Value("${MIDDLEWARE_SERVER_IP}")
	private String middlewareServerIp;

	@Value("${MIDDLEWARE_SERVER_PORT}")
	private String middlewareServerPort;

	public String getMiddlewareServerIp() {
		return middlewareServerIp;
	}

	public void setMiddlewareServerIp(String middlewareServerIp) {
		this.middlewareServerIp = middlewareServerIp;
	}

	public String getMiddlewareServerPort() {
		return middlewareServerPort;
	}

	public void setMiddlewareServerPort(String middlewareServerPort) {
		this.middlewareServerPort = middlewareServerPort;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
	}

}
