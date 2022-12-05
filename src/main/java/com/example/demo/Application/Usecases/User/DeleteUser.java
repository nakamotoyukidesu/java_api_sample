package com.example.demo.Application.Usecases.User;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Infrastructure.Entity.User.UserEntity;
import com.example.demo.Infrastructure.Repositories.UserRepository;

@Service
@Transactional
public class DeleteUser {

	@Autowired
	private UserRepository userRepo;
	
	public Object delete() {
		userRepo.deleteAll();
		return "すべてのデータが削除されました";
	}
	
	public Object delete(String user_id) {
		Optional<UserEntity> userEntityOptional = userRepo.findById(user_id);
		if(userEntityOptional != null) {
			userRepo.delete(userEntityOptional.get());
			return user_id + "のデータが削除されました";
		}else {
			return "user_idが存在しません";
		}
	}
	
	
}
