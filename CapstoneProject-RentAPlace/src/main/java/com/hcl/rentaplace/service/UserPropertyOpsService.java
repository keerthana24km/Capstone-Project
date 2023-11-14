package com.hcl.rentaplace.service;

/*
 * Author: Keerthana
 * Date: 18/01/2023
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.rentaplace.entity.Property;
import com.hcl.rentaplace.repository.IUserPropertyOpsRepository;

@Service
public class UserPropertyOpsService implements IUserPropertyOpsService{

	@Autowired
	IUserPropertyOpsRepository userPropRepo;

	@Override
	public List<Property> getAllProperties() {
		// TODO Auto-generated method stub
		return userPropRepo.findAll();
	}

	@Override
	public Property searchPropertyById(Long propertyId) {
		// TODO Auto-generated method stub
		return userPropRepo.findById(propertyId).orElse(null);
	}
}
