package com.cluster.bidirectional.m2m;

import java.util.Set;

public class Student {
	
	private int sid;
	private String studentName;
	private Set<Address> hsAddress;
	
	public Set<Address> getHsAddress() {
		return hsAddress;
	}
	public void setHsAddress(Set<Address> hsAddress) {
		this.hsAddress = hsAddress;
	}
	Student(String studentName){
		this.studentName = studentName;
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

	

}
