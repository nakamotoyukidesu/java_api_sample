package com.example.demo.Application.Controller.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Application.Request.User.ShowUserRequest;
import com.example.demo.Application.Usecases.User.ShowUser;
import com.example.demo.Infrastructure.Entity.User.UserEntity;

@RestController
public class ShowUserController {
	
	@Autowired
	ShowUser showUser;
	
	@GetMapping(value = "show")
	public List<UserEntity> show(ShowUserRequest request) {
		return showUser.show();
	}
}
