package com.hcl.microservice.services;

import java.util.List;
import java.util.Optional;

import com.hcl.microservice.entities.Property;



public interface IPropertyService {

	public List<Property> getAllProperties();
	public Property addProperty(Property property);
	public String deleteProperty(long propertyId);
	public Property updateProperty(Property property);
	public Optional<Property> searchProperty(long propertyId);
	public String setAvailablity(long propertyId);
	
}
