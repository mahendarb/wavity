package com.wavity.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * The Class EmployeePostClient
 * 
 * @author wavity
 *
 */
public class EmployeePostClient {

	/**
	 * main method program executing from here
	 * 
	 * @param args
	 * @throws JsonProcessingException
	 */
	public static void main(String[] args) throws JsonProcessingException {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:9090/Employee/rest").path("post");
		Builder builder = target.request(MediaType.APPLICATION_JSON);
		Response response = builder.post(Entity.json(""));
		String dataJson = response.readEntity(String.class);
		System.out.println("Status  : " + response.getStatus());
		ObjectMapper mapper = new ObjectMapper();
		String jsonString = mapper.writeValueAsString(dataJson);
		System.out.println(jsonString);

	}

}
