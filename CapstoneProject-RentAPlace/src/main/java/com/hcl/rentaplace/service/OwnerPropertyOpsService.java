package com.hcl.rentaplace.service;

/*
 * Author: Keerthana
 * Date: 18/01/2023
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.rentaplace.entity.Property;
import com.hcl.rentaplace.exception.PropertyNotFoundException;
import com.hcl.rentaplace.repository.IOwnerPropertyOpsRepository;

@Service
public class OwnerPropertyOpsService implements IOwnerPropertyOpsService{
	
	@Autowired
	IOwnerPropertyOpsRepository propertyRepo;

	@Override
	public List<Property> getAllProperties() {
		// TODO Auto-generated method stub
		return propertyRepo.findAll();
	}

	@Override
	public Property addProperty(Property property) {
		// TODO Auto-generated method stub
		propertyRepo.save(property);
		return propertyRepo.save(property);
	}

	@Override
	public String deleteProperty(Long propertyId) {
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
	public Property searchProperty(Long propertyId) {
		// TODO Auto-generated method stub
		Property property = propertyRepo.findById(propertyId).orElse(null);
		if(property!=null) {
			System.out.println("Property Found!");
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
	public String setAvailablity(Long propertyId) {
		// TODO Auto-generated method stub
		String available = "";
		List<Property> properties = propertyRepo.findAll();
		for(Property p : properties) {
			if(p.getPropertyId() == propertyId && p.getAvailability().equals("Available")) {
				p.setAvailability("Available");
				available = "Available";
				break;
			}
		}
		return available;
	}

}
