package com.hcl.microservice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.microservice.entities.Property;
import com.hcl.microservice.exceptions.PropertyNotFoundException;
import com.hcl.microservice.repositories.IPropertyRepository;


@Service
public class PropertyService implements IPropertyService{
	
	@Autowired
	IPropertyRepository propertyRepo;

	@Override
	public List<Property> getAllProperties() {
		// TODO Auto-generated method stub
		return propertyRepo.findAll();
	}

	@Override
	public Property addProperty(Property property) {
		// TODO Auto-generated method stub
		return propertyRepo.save(property);
	}

	@Override
	public String deleteProperty(long propertyId) {
		// TODO Auto-generated method stub
		propertyRepo.deleteById(propertyId);
		return "Deletion Successful!";
	}

	@Override
	public Property updateProperty(Property property) {
		// TODO Auto-generated method stub
		List<Property> properties = propertyRepo.findAll();
		for(Property p : properties) {
			if(p.getPropertyId() == property.getPropertyId()) {
				p = property;
				break;
			}
		}
		return property;
	}

	@Override
	public Optional<Property> searchProperty(long propertyId) {
		// TODO Auto-generated method stub
		Optional<Property> property = propertyRepo.findById(propertyId);
		if(property!=null) {
			Optional<Property> propFound = property;
		}else {
			try {
			throw new PropertyNotFoundException();
			}catch(PropertyNotFoundException pnfe) {
				System.out.println("Property Not Found...");
			}
		}
		return property;
	}

	@Override
	public String setAvailablity(long propertyId) {
		// TODO Auto-generated method stub
		String reservation = "";
		List<Property> properties = propertyRepo.findAll();
		for(Property p : properties) {
			if(p.getPropertyId() == propertyId && p.getAvailability().equals("Available")) {
				p.setAvailability("Available");
				reservation = "Available";
				break;
			}
		}
		return reservation;
	}

}
