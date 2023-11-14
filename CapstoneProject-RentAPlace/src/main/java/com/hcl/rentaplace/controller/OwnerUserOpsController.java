package com.hcl.rentaplace.controller;

/*
 * Author: Likitha
 * Date: 18/01/2023
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.rentaplace.entity.User;
import com.hcl.rentaplace.service.OwnerUserOpsService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/owner")
public class OwnerUserOpsController {

	@Autowired
	OwnerUserOpsService ownerUserService;
	
	@GetMapping("/user/getAllUsers")
	public List<User> getAllUsers(){
		return ownerUserService.getAllUsers();
	}
	
	@PostMapping("/user/addUser")
	public User addUser(@RequestBody User user) {
		return ownerUserService.addUser(user);
	}
	
	@PutMapping("/user/updateUser/{userId}")
	public String updateUser(@PathVariable Long userId,@RequestBody User user) {
		return ownerUserService.updateUser(userId, user);
	}
	
	@DeleteMapping("/user/deleteUserById/{userId}")
	public String deleteUserById(@PathVariable Long userId) {
		return ownerUserService.deleteUserById(userId);
	}
	
	@GetMapping("/user/searchUserById/{userId}")
	public User searchUserById(@PathVariable Long userId) {
		return ownerUserService.searchUserById(userId);
	}
}
