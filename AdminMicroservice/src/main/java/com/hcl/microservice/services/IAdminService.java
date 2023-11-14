package com.hcl.microservice.services;

import java.util.List;



import org.springframework.http.ResponseEntity;

import com.hcl.microservice.dto.UserDTO;
import com.hcl.microservice.entities.Admin;
import com.hcl.microservice.entities.User;
import com.hcl.microservice.exceptions.AdminNotFoundException;

public interface IAdminService {

	
	
	
	public User addUser(UserDTO userDto);
	
	
	public User updateUser(UserDTO userDto);
	
	
	public String deleteUserById(long userId);
	
	
	public User getUserById(long userId);
	
	
	public List<User> displayUser(UserDTO userDto);
	

	public ResponseEntity<String> registerAdmin(Admin admin);
	
	
	public Admin getAdminByAdminName(String adminName) throws AdminNotFoundException;
	
	
	
}
