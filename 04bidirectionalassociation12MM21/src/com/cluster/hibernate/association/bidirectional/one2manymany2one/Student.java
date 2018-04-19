package com.cluster.hibernate.association.bidirectional.one2manymany2one;

import java.util.HashSet;
import java.util.Set;

public class Student {
	
	private int sid;
	private String studentName;
	private Set<Address> hsAddress = new HashSet<Address>();
	
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
	public Set getHsAddress() {
		return hsAddress;
	}
	public void setHsAddress(Set<Address> hsAddress) {
		this.hsAddress = hsAddress;
	}
	

}
