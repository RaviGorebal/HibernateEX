package com.cluster.bidirectional.m2m;

import java.util.Set;

public class Address {
	
	private int addressId;
	private String zipCode;
	private Set<Student> hsStudent;
	
	
	public Address(String zipcode){
		this.zipCode = zipcode;		
	}

	public Set<Student> getHsStudent() {
		return hsStudent;
	}

	public void setHsStudent(Set<Student> hsStudent) {
		this.hsStudent = hsStudent;
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
