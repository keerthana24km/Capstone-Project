package com.hcl.microservice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;


import com.hcl.microservice.entities.User;
import com.hcl.microservice.exceptions.UserNotFoundException;


public interface IUserService {

	public User Register(User user);
	public User login(String userName,String userPassword);
	public List<User> getAll();
	 public User update(long id, User user);
	 public void delete(User user) ;
	 public Optional<User> get(Long userId);
	public User getUserByUserName(String userName);
	public ResponseEntity<String> registerUser(User user);
}
