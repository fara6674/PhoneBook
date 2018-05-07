package com.phoneBook;

public class Person implements Comparable<Person>{

	private String firstName, lastName; 

	// private String lastName;

	private Address address;

	public Person(String firstName, String lastName, Address address) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;

	}

	public Person() {
	}
	 @Override
	public int compareTo(Person p) {
		return this.firstName.compareTo(p.getFirstName());
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

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + "]";
	}

	// will add-->> date of birth
	
	

}
