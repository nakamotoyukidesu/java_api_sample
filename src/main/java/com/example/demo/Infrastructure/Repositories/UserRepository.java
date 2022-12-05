package com.example.demo.Infrastructure.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Infrastructure.Entity.User.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,String> {

}
