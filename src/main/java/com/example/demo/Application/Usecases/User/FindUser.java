package com.example.demo.Application.Usecases.User;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Infrastructure.Entity.User.UserEntity;
import com.example.demo.Infrastructure.Repositories.UserRepository;

@Service
@Transactional
public class FindUser {
	
	@Autowired
	private UserRepository userRepo;
	
	public Optional<UserEntity> find(String user_id) {
		return userRepo.findById(user_id);
	}
	
}
