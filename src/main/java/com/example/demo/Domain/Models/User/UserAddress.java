package com.example.demo.Domain.Models.User;

public class UserAddress {
	
	private String address;
	
	public UserAddress(String address) {
		this.address = address;
	}
	
	public static UserAddress of(String value) {
		return new UserAddress(value);
	}
	
	public String value() {
		return this.address;
	}
}
