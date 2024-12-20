package com.royal.bean;

public class EmployeeBean 
{
	int eid;
	private String fullname = null;
	private String birthdate = null;
	private String gender = null;
	private String language = null;
	private String email = null;
	private String mobile = null;
	private String state = null;
	private String department = null;
	private String designation = null;		
	private String employment = null;

	
	public EmployeeBean()
	{
		
	}


	public EmployeeBean(int eid, String fullname, String birthdate, String gender, String language, String email,
			String mobile, String state, String department, String designation, String employment) {
	
		this.eid = eid;
		this.fullname = fullname;
		this.birthdate = birthdate;
		this.gender = gender;
		this.language = language;
		this.email = email;
		this.mobile = mobile;
		this.state = state;
		this.department = department;
		this.designation = designation;
		this.employment = employment;
	}


	public int getEid() {
		return eid;
	}


	public void setEid(int eid) {
		this.eid = eid;
	}


	public String getFullname() {
		return fullname;
	}


	public void setFullname(String fullname) {
		this.fullname = fullname;
	}


	public String getBirthdate() {
		return birthdate;
	}


	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getLanguage() {
		return language;
	}


	public void setLanguage(String language) {
		this.language = language;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public String getEmployment() {
		return employment;
	}


	public void setEmployment(String employment) {
		this.employment = employment;
	}


		
}