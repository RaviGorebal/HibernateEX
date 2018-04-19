package com.cluster.hibernate.association.bidirectional.one2manymany2one;

public class Address {
	
	private int addressId;
//	private String street;
//	private String City;
//	private String State;
	private String zipCode;
	private Student student;
	
	
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

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

}
