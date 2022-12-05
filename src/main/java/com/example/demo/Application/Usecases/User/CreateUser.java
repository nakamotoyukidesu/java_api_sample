package com.example.demo.Application.Usecases.User;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Domain.Models.User.User;
import com.example.demo.Infrastructure.Entity.User.UserEntity;
import com.example.demo.Infrastructure.Repositories.UserRepository;

@Service
@Transactional
public class CreateUser {
	
	@Autowired
	private UserRepository userRepo;
	
	public UserEntity save(User user) {
		
		UserEntity userEntity = new UserEntity();
		userEntity.setUser_id(user.user_id().value());
		userEntity.setUser_name(user.user_name().value());
		userEntity.setUser_address(user.user_address().value());
		return userRepo.save(userEntity);
		
	}

}
