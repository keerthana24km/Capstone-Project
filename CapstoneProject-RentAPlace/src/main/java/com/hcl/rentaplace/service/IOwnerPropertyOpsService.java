package com.hcl.rentaplace.service;

/*
 * Author: Keerthana
 * Date: 18/01/2023
 */

import java.util.List;

import com.hcl.rentaplace.entity.Property;

public interface IOwnerPropertyOpsService {

	public List<Property> getAllProperties();
	public Property addProperty(Property property);
	public String deleteProperty(Long propertyId);
	public Property updateProperty(Property property);
	public Property searchProperty(Long propertyId);
	public String setAvailablity(Long propertyId);
	
}
