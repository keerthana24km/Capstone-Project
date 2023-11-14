package com.hcl.microservice.restcontrollers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.microservice.entities.Property;
import com.hcl.microservice.services.PropertyService;


@RestController
@RequestMapping("/api/property")
public class PropertyController {

	@Autowired
	PropertyService propertyService;
	
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
	public Optional<Property> searchProperty(@PathVariable Long propertyId){
		return propertyService.searchProperty(propertyId);
	}
	
	@GetMapping("/property/availability/{propertyId}")
	public String setAvailablity(@PathVariable Long propertyId) {
		return propertyService.setAvailablity(propertyId);
	}
}
