package com.example.springMvcExample.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class User {

	private int userId;
	@Pattern(regexp = "^[A-Za-z]+$", message = "Username must have only alphabets")
	@NotEmpty(message = "Username is required")
	@Size(min = 3, max = 30, message = "Username must be between 3 to 20 characters")
	private String username;

	@NotEmpty(message = "Password is required")
	@Size(min = 3, max = 30, message = "Password must be between 3 to 20 characters")
	private String password;

	@NotEmpty(message = "User/Admin")
	private String usertype;

	@Email(message = "Give the required format")
	private String email;

	private long mobileNumber;

	private String confirmed;

	public int getuserId() {
		return userId;
	}

	public void setuserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsertype() {
		return usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getConfirmed() {
		return confirmed;
	}

	public void setConfirmed(String confirmed) {
		this.confirmed = confirmed;
	}

}
