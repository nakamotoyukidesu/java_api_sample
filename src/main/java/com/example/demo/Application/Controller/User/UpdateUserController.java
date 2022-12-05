package com.example.demo.Application.Controller.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Application.Request.User.UpdateUserRequest;
import com.example.demo.Application.Usecases.User.UpdateUser;

@RestController
public class UpdateUserController {
	
	@Autowired
	private UpdateUser updateUser;
	
	@PutMapping(value = "update")
	public Object update(UpdateUserRequest request) {
		return updateUser.update(request.updateUser());
	}
}
