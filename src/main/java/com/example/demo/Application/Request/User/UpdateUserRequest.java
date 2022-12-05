package com.example.demo.Application.Request.User;

import javax.validation.constraints.NotBlank;

import com.example.demo.Domain.Models.User.User;
import com.example.demo.Domain.Models.User.UserAddress;
import com.example.demo.Domain.Models.User.UserId;
import com.example.demo.Domain.Models.User.UserName;

import lombok.Setter;

@Setter
public class UpdateUserRequest {
	
	@NotBlank
	public String id;
	public String name;
	public String address;
	
	public UpdateUserRequest() {}
	
	public User updateUser() {
		User user = new User(
			UserId.of(this.id.toString()),
			UserName.of(this.name.toString()),
			UserAddress.of(this.address.toString())
		);
		return user;
	}
}
