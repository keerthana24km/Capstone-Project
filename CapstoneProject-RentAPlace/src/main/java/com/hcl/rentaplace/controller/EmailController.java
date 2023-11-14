package com.hcl.rentaplace.controller;

/*
 * Author: Keerthana
 * Date: 19/01/2023
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.rentaplace.entity.EmailDetails;
import com.hcl.rentaplace.service.EmailService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class EmailController {

	@Autowired
	EmailService emailService;
	
	@PostMapping("/email")
	public String sendEmail(@RequestBody EmailDetails email) {
		return emailService.reservationResponse(email);
	}
}
