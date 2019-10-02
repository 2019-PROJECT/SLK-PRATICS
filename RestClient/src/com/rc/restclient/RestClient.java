package com.rc.restclient;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class RestClient {

	public static void main(String[] args) {
		ClientBuilder clientBuilder = ClientBuilder.newBuilder();
		Client client = clientBuilder.build();
		WebTarget target = client.target("http://localhost:8080/FirstRestApiExpose/rest/service");
		
		Response response = target.request().get();
		if(response.getStatus()==200) {
			String status = response.readEntity(String.class);
			System.out.println(status);
	}
}
}