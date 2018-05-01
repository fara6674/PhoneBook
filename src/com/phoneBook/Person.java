package com.phoneBook;

public class Person {

	private String firstName, lastName; // middleName

	// private String lastName;

	private Address address;

	public Person(String firstName, String lastName, Address address) {

		this.firstName = firstName;
		this.lastName = lastName;
		// this.middleName=middleName;
		this.address = address;

	}

	public Person() {
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	// will add-->> date of birth

}
