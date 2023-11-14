package com.hcl.rentaplace.controller;

/*
 * Author: Keerthana
 * Date: 18/01/2023
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.rentaplace.entity.Reserved;
import com.hcl.rentaplace.service.OwnerReservedOpsService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class OwnerReservedOpsController {

	@Autowired
	OwnerReservedOpsService reservedService;
	
	@GetMapping("reserved/getAllReservations")
	public List<Reserved> getAllReservations(){
		return reservedService.getAllReservations();
	}
}
