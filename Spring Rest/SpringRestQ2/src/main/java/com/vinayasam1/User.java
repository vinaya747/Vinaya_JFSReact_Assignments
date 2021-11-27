package com.vinayasam1;

import org.springframework.stereotype.Component;

@Component
public class User {
	
	private String Username;
	private String Password;
	private String email;
	
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		
		return Username;
	}
	

}
