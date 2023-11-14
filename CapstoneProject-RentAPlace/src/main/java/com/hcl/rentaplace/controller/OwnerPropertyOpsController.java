package com.hcl.rentaplace.controller;

/*
 * Author: Keerthana
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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.rentaplace.entity.Property;
import com.hcl.rentaplace.service.OwnerPropertyOpsService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@CrossOrigin
@RestController
@RequestMapping("/api/owner")
public class OwnerPropertyOpsController {

	@Autowired
	OwnerPropertyOpsService propertyService;
	
	@GetMapping("/property/propertiesList")
	public List<Property> getAllProperties(){
		return propertyService.getAllProperties();
	}
	
	@PostMapping("/property/addProperty")
	public Property addProperty(@RequestBody Property property) {
		return propertyService.addProperty(property);
	}
	
	@DeleteMapping("/property/deleteProperty/{propertyId}")
	public String deleteProperty(@PathVariable Long propertyId) {
		propertyService.deleteProperty(propertyId);
		return "Deletion Successful!";
	}
	
	@PutMapping("/property/updateProperty")
	public Property updateProperty(@RequestBody Property property) {
		return propertyService.updateProperty(property);
	}
	
	@GetMapping("/property/searchPropertyById/{propertyId}")
	public Property searchProperty(@PathVariable Long propertyId){
		return propertyService.searchProperty(propertyId);
	}
	
	@PutMapping("/property/availability/{propertyId}")
	public String setAvailablity(@PathVariable Long propertyId) {
		return propertyService.setAvailablity(propertyId);
	}
}
