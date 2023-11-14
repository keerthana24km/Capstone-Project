package com.hcl.rentaplace.controller;

/*
 * Author: Keerthana
 * Date: 19/01/2023
 */

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.rentaplace.entity.Reserved;
import com.hcl.rentaplace.service.UserReservedOpsService;

@CrossOrigin
@RestController
@RequestMapping("/api/user")
public class UserReservedOpsController {

	@Autowired
	UserReservedOpsService userResvService;
	
	@GetMapping("/reserved/getAllReservations")
	public List<Reserved> getAllReservations(){
		return userResvService.getAllReservations();
	}
	
	@PostMapping("/reserved/addToReserved")
	public Reserved addToReserved(@RequestBody Reserved reservation) {
		return userResvService.addToReserved(reservation);
	}
	
	@GetMapping("/reserved/deleteFromReservedById/{propertyId}")
	public String deleteFromReservedById(Long propertyId) {
		return userResvService.deleteFromReservedById(propertyId);
	}
	
	@PutMapping("/reserved/updateToReserved/{propertyId}")
	public String updateToReserved(@PathVariable Long propertyId,@RequestBody Date checkIn,@RequestBody Date checkOut) {
		return userResvService.updateToReserved(propertyId, checkIn, checkOut);
	}
	
	@GetMapping("/reserved/searchInReserved/{propertyId}")
	public Reserved searchInReserved(@PathVariable Long propertyId) {
		return userResvService.searchInReserved(propertyId);
	}
}
