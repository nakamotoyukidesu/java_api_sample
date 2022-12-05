package com.example.demo.Infrastructure.Entity.User;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

//import org.springframework.data.annotation.Id;

@Entity
@Getter
@Setter
@Table(name = "users")
public class UserEntity {
	
	@Id
	private String user_id;
	
	private String user_name;
	
	private String user_address;

}
