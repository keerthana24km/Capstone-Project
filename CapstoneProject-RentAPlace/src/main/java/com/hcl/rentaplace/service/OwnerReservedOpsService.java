package com.hcl.rentaplace.service;

/*
 * Author: Keerthana
 * Date: 19/01/2023
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.rentaplace.entity.Reserved;
import com.hcl.rentaplace.repository.IOwnerReservedOpsRepository;

@Service
public class OwnerReservedOpsService implements IOwnerReservedOpsService{

	@Autowired
	IOwnerReservedOpsRepository reservedRepo;
	
	@Override
	public List<Reserved> getAllReservations() {
		// TODO Auto-generated method stub
		return reservedRepo.findAll();
	}

}
