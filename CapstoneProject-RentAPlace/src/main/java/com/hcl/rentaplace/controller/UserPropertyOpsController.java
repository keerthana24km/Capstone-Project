package com.hcl.rentaplace.controller;

/*
 * Author: Keerthana
 * Date: 18/01/2023
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.rentaplace.entity.Property;
import com.hcl.rentaplace.service.UserPropertyOpsService;

@CrossOrigin
@RestController
@RequestMapping("/api/user")
public class UserPropertyOpsController {

	@Autowired
	UserPropertyOpsService userPropService;
	
	@GetMapping("/property/getAllProperties")
	public List<Property> getAllProperties(){
		return userPropService.getAllProperties();
	}
	
	@GetMapping("/property/searchPropertyById/{propertyId}")
	public Property searchPropertyById(@PathVariable Long propertyId) {
		return userPropService.searchPropertyById(propertyId);
	}
}
