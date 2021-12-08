package com.example.webservices.dto;

public class User {
	
	private long id;
	private String firstName;
	private String lastName;
	private String userName;
	private String ssn;
	
	
	public User(long id, String userName, String ssn) {
		super();
		this.id = id;
		this.userName = userName;
		this.ssn = ssn;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", userName=" + userName
				+ ", ssn=" + ssn + "]";
	}
	
	
	
	

}
