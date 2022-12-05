package com.example.demo.Application.Request.User;


import java.util.UUID;

import javax.validation.constraints.NotBlank;

import com.example.demo.Domain.Models.User.User;
import com.example.demo.Domain.Models.User.UserAddress;
import com.example.demo.Domain.Models.User.UserId;
import com.example.demo.Domain.Models.User.UserName;

import lombok.Setter;

@Setter
public class CreateUserRequest {
	
	@NotBlank
	public String name;
	public String address;
	
	public CreateUserRequest() {}
	
	
	public User createUser() {
		User user = new User(
			UserId.of(UUID.randomUUID().toString()),
			UserName.of(this.name.toString()),
			UserAddress.of(this.address.toString())
		);
		return user;
	}
}
