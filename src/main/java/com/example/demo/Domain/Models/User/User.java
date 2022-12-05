package com.example.demo.Domain.Models.User;

public class User {
	
	private UserId user_id;
	private UserName user_name;
	private UserAddress user_address;
	
	public User
	(
		UserId user_id,
		UserName user_name,
		UserAddress user_address
	) 
	{
		this.user_id = user_id;
		this.user_name = user_name;
		this.user_address = user_address;
	}
	
	public UserId user_id() {
		return this.user_id;
	}
	
	public UserName user_name() {
		return this.user_name;
	}
	
	public UserAddress user_address() {
		return this.user_address;
	}
}
