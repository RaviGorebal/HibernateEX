package com.cluster.hibernate.association.unidirectional.one2one;

public class Address {
	
	private int addressId;
//	private String street;
//	private String City;
//	private String State;
	private String zipCode;
	
	public Address(String zipcode){
		this.zipCode = zipcode;		
	}
	public Address(){
		
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
}
