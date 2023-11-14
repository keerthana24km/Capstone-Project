package com.hcl.rentaplace.service;

/*
 * Author: Keerthana
 * Date: 18/01/2023
 */

import java.util.List;

import com.hcl.rentaplace.entity.Property;

public interface IUserPropertyOpsService {

	public List<Property> getAllProperties();
	public Property searchPropertyById(Long propertyId);
}
