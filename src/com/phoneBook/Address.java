package com.phoneBook;

public class Address {

	private String streetNumber, streetName, city, state, zip, phone, eMail;

	/*
	 * String streetName;
	 * 
	 * String city;
	 * 
	 * String state;
	 * 
	 * String zip;
	 * 
	 * String phone;
	 * 
	 * String eMail;
	 */

	public Address() {
	}

	public Address(String streetNumber, String streetName, String city, String state, String zip, String phone,
			String eMail) {

		this.streetNumber = streetNumber;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phone = phone;
		this.eMail = eMail;

	}

	public String getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPhone() {
		String a = phone.substring(0, 3);
		String b = phone.substring(3, 6);
		String c = phone.substring(6, 10);
		String newPhone = "(" + a + ")-" + b + "-" + c;

		return newPhone;

	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	@Override
	public String toString() {

		return "Address " + streetNumber + " " + streetName + " " + city + " " + state + " " + zip + " " + getPhone()
				+ " " + eMail + "";
	}

}
