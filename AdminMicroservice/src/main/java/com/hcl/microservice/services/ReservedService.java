package com.hcl.microservice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.microservice.entities.Reserved;
import com.hcl.microservice.repositories.IReservedRepository;



@Service
public class ReservedService implements IReservedService{

	@Autowired
	IReservedRepository reservedRepo;
	
	@Override
	public List<Reserved> getAllReservations() {
		// TODO Auto-generated method stub
		return reservedRepo.findAll();
	}

}
