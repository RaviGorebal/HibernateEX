package com.cluster.hibernate.basic;

public class Student {
	
	private int sid;
	private String sname;
	private String email;
	private String phoneno;
	
	public Student( String sname, String email, String phoneno){
		this.sname = sname;
		this.email = email;
		this.phoneno = phoneno;
	}
	
	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public Student(){
		
	}
		
	
	
	public String toString() {
		return new Integer(sid).toString();
	}
}
