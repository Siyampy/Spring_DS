package com;

public class Address 
{
	private String addressLine2;
	private String addressLine1;
	private String city;
	private String state;
	private int pincode;
	private Contact contact;
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
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
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public Contact getContact() {
		return contact;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}
//	public Address(String addressLine2, String addressLine1, String city, String state, int pincode, Contact contact) {
//		super();
//		this.addressLine2 = addressLine2;
//		this.addressLine1 = addressLine1;
//		this.city = city;
//		this.state = state;
//		this.pincode = pincode;
//		this.contact = contact;
//	}
	
	

}
