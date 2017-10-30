package com.wavity.Employee;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.wavity.model.Employee;

/**
 * Root resource (exposed at "rest" path)
 */
@Path("/rest")
@Produces(MediaType.APPLICATION_JSON)
public class MyResource {

	/**
	 * Method handling HTTP GET requests. The returned object will be sent to
	 * the client as "text/plain" media type.
	 *
	 * @return String that will be returned as a application/json response.
	 */
	@GET
	@Produces("application/json")
	@Path("/get")
	public Employee getEmploye(@QueryParam("name") String name, @QueryParam("role") String role,
			@QueryParam("address") String address) {

		Employee employee = new Employee();
		employee.setName(name);
		System.out.println(name);
		employee.setRole(role);
		System.out.println(role);
		employee.setAddress(address);
		System.out.println(address);

		return employee;

	}

	/**
	 * @param employee
	 * @return
	 */

	@Path("/post")
	public Employee create() {
		Employee employee = new Employee();
		employee.setName("xyz");
		employee.setRole("admin");
		employee.setAddress("wgl");
		return employee;
	}
}
