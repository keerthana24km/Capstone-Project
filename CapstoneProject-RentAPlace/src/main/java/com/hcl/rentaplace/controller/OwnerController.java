package com.hcl.rentaplace.controller;

/*
 * Author: Likitha
 * Date: 17/01/2023
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.rentaplace.entity.Owner;
import com.hcl.rentaplace.service.OwnerService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class OwnerController {
	
	@Autowired
	OwnerService ownerService;
	
	@PostMapping("/owner/register")
	public String register(@RequestBody Owner owner ) {
		
		ownerService.Register(owner);
		return "Registered successfully";
	}
	
	@GetMapping("/owner/login")
	public String login(@RequestBody Owner owner) {
		return ownerService.login(owner);
	}

}
