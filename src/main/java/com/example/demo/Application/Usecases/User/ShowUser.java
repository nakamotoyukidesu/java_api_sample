package com.example.demo.Application.Usecases.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Infrastructure.Entity.User.UserEntity;
import com.example.demo.Infrastructure.Repositories.UserRepository;

@Service
public class ShowUser {
	
	@Autowired
	private UserRepository userRepo;
	
	public List<UserEntity> show() {
		return userRepo.findAll();
	}

}
