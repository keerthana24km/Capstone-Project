package com.hcl.rentaplace.controller;

/*
 * Author: Likitha
 * Date: 17/01/2023
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.rentaplace.entity.User;
import com.hcl.rentaplace.service.UserService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class UserController {
	@Autowired
	UserService userService;

	@PostMapping("/user/register")
	public String Register(@RequestBody User user) {
		return userService.Register(user);
	}

	@PostMapping("/user/login")
	public String Login(@RequestBody User user) {
		return userService.login(user);
	}
	
}
