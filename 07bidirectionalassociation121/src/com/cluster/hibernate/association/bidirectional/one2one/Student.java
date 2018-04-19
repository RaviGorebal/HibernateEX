package com.cluster.hibernate.association.bidirectional.one2one;

public class Student {
	
	private int sid;
	private String studentName;
	private Address address;
	
	public Student(String studentName){
		this.studentName = studentName;
	}
	 
	public Student(){
		
	}
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}
