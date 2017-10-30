package com.wavity.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * The Class EmployeeGetClient
 * 
 * @author wavity
 *
 */
public class EmployeeGetClient {

	/**
	 * main method program executing from here
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:9090/Employee/rest")
				.path("get?name=ABC&role=ADMIN&address=HYD");
		Builder builder = target.request(MediaType.APPLICATION_JSON).header("Accept", "application/json");
		Response response = builder.get();
		System.out.println(response.getStatus());
		System.out.println(response.readEntity(String.class));

	}

}
