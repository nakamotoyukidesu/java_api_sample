package com.example.demo.Application.Controller.User;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Application.Request.User.FindUserRequest;
import com.example.demo.Application.Usecases.User.FindUser;
import com.example.demo.Infrastructure.Entity.User.UserEntity;

@RestController
public class FindUserController {
	
	@Autowired 
	FindUser findUser;
	
	@GetMapping(value = "find")
	public Optional<UserEntity> find(FindUserRequest request) {
		return findUser.find(request.user_id);
	}

}
