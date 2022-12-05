package com.example.demo.Domain.Models.User;

public class UserName {
	
	private String name;
	
	public UserName(String name) {
		this.name = name;
	}
	
	public static UserName of(String value) {
		return new UserName(value);
	}
	
	public String value() {
		return this.name;
	}

}
