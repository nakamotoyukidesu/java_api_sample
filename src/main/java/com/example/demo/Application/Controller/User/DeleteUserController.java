package com.example.demo.Application.Controller.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Application.Request.User.DeleteUserRequest;
import com.example.demo.Application.Usecases.User.DeleteUser;

@RestController
public class DeleteUserController {
	
	@Autowired
	private DeleteUser deleteUser;
	
	@DeleteMapping(value = "delete")
	public Object delete(DeleteUserRequest request){
		if(request.user_id == null) {
			return deleteUser.delete();
		}else {
			return deleteUser.delete(request.user_id);
		}
	}
}
