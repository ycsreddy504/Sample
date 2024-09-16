package com.vedait.hasa.relationship;

public class Address {
	
	String houno;
	String city;
	String state;
	String country;
	String zipcode;  // 515154 
	public Address() {
		
	}
	public Address(String houno, String city, String state, String country, String zipcode) {
		this.houno = houno;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipcode = zipcode;
	}
	@Override
	public String toString() {
		return "Address [houno=" + houno + ", city=" + city + ", state=" + state + ", country=" + country + ", zipcode="
				+ zipcode + "]";
	}
	
	
	
	
	

}
