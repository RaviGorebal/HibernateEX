package com.cluster.action;

import org.apache.struts.validator.ValidatorForm;


@SuppressWarnings("serial")
public class EmployeeForm extends ValidatorForm {
	
	private String firstName;
	private String middleName;
	private String lastName;
	private String gender;
	private String presentAddressLine1;
	private String presentAddressLine2;
	private String presentCity;
	private String presentState;
	private String presentZipcode;
	private String permanentAddressLine1;
	private String permanentAddressLine2;
	private String permanentCity;
	private String permanentZipcode;
	private String permanentState;
	private String officePhone;
	private String homePhone;
	private String mobilePhone;
	private String emailID;
	private int employeeId;

	public EmployeeForm() {
		
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getMiddleName() {
		return middleName;
	}


	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getPresentAddressLine1() {
		return presentAddressLine1;
	}


	public void setPresentAddressLine1(String presentAddressLine1) {
		this.presentAddressLine1 = presentAddressLine1;
	}


	public String getPresentAddressLine2() {
		return presentAddressLine2;
	}


	public void setPresentAddressLine2(String presentAddressLine2) {
		this.presentAddressLine2 = presentAddressLine2;
	}


	public String getPresentCity() {
		return presentCity;
	}


	public void setPresentCity(String presentCity) {
		this.presentCity = presentCity;
	}


	public String getPresentState() {
		return presentState;
	}


	public void setPresentState(String presentState) {
		this.presentState = presentState;
	}


	public String getPresentZipcode() {
		return presentZipcode;
	}


	public void setPresentZipcode(String presentZipcode) {
		this.presentZipcode = presentZipcode;
	}


	public String getPermanentAddressLine1() {
		return permanentAddressLine1;
	}


	public void setPermanentAddressLine1(String permanentAddressLine1) {
		this.permanentAddressLine1 = permanentAddressLine1;
	}

	public String getPermanentAddressLine2() {
		return permanentAddressLine2;
	}
	
	public void setPermanentAddressLine2(String permanentAddressLine2) {
		this.permanentAddressLine2 = permanentAddressLine2;
	}

	public String getPermanentCity() {
		return permanentCity;
	}


	public void setPermanentCity(String permanentCity) {
		this.permanentCity = permanentCity;
	}


	public String getPermanentZipcode() {
		return permanentZipcode;
	}


	public void setPermanentZipcode(String permanentZipcode) {
		this.permanentZipcode = permanentZipcode;
	}


	public String getPermanentState() {
		return permanentState;
	}


	public void setPermanentState(String permanentState) {
		this.permanentState = permanentState;
	}


	public String getOfficePhone() {
		return officePhone;
	}


	public void setOfficePhone(String officePhone) {
		this.officePhone = officePhone;
	}


	public String getHomePhone() {
		return homePhone;
	}


	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}


	public String getMobilePhone() {
		return mobilePhone;
	}


	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}


	public String getEmailID() {
		return emailID;
	}


	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
}
