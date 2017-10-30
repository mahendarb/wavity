package com.wavity.model;

/**
 * The Class Employee
 * 
 * @author wavity
 *
 */

public class Employee {

	/**
	 * local variable name declared as private
	 * 
	 */
	private String name;
	/**
	 * local variable role declared as private
	 * 
	 */
	private String role;
	/**
	 * local variable address declared as private
	 * 
	 * 
	 */
	private String address;

	/**
	 * Default constructor .Invoked at the time of Object creation
	 */
	public Employee() {

	}

	/**
	 * Parameterized constructor .Invoked at the time of Object creation
	 * 
	 * @param name
	 * @param role
	 * @param address
	 */
	public Employee(String name, String role, String address) {
		super();
		this.name = name;
		this.role = role;
		this.address = address;
	}

	/**
	 * @return String name
	 */

	public String getName() {
		return name;
	}

	/**
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return String role
	 */

	public String getRole() {
		return role;
	}

	/**
	 * @param role
	 */
	public void setRole(String role) {
		this.role = role;
	}

	/**
	 * @return String address
	 */

	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", role=" + role + ", address=" + address + "]";
	}

}
