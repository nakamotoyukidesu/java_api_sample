package com.example.demo.Domain.Models.User;

public class UserId {
	
	private String id;
	
	public UserId(String id) {
		this.id = id;
	}
	
	public static UserId of(String value) {
		return new UserId(value);
	}
	
	public String value() {
		return this.id;
	}
}
