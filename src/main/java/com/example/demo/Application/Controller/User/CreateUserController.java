package com.example.demo.Application.Controller.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Application.Request.User.CreateUserRequest;
import com.example.demo.Application.Usecases.User.CreateUser;

@RestController
public class CreateUserController {
	@Autowired
	CreateUser createUser;
	
	
	@PostMapping(value = "create")
	public Object create(@Validated CreateUserRequest request, BindingResult result) {
		
		if(result.hasErrors()) {
//			return "バリデーションエラー";
		}
		System.out.println(request.createUser().user_address().value());
		System.out.println(request.createUser().user_name().value());
		return createUser.save(request.createUser());
	}
}
