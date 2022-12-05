package com.example.demo.Application.Usecases.User;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Domain.Models.User.User;
import com.example.demo.Infrastructure.Entity.User.UserEntity;
import com.example.demo.Infrastructure.Repositories.UserRepository;

@Service
@Transactional
public class UpdateUser {
	
	@Autowired
	private UserRepository userRepo;
	
//	user.user_id()がデータベースに存在しない場合Exeptionオブジェクトを返す
	public Object update(User user) {
		
		
		Optional<UserEntity> userEntityOptional = userRepo.findById(user.user_id().value());
		if(userEntityOptional != null) {
			UserEntity userEntity = userEntityOptional.get();
			if(!user.user_name().value().equals("")) {
				userEntity.setUser_name(user.user_name().value());
			}
			if(!user.user_address().value().equals("")) {
				userEntity.setUser_address(user.user_address().value());
			}
			return userRepo.save(userEntity);
		}else {
			return userEntityOptional;
		}
		
	}
}
