package com.hcl.microservice.services;

import java.util.List;

import com.hcl.microservice.entities.Reserved;


public interface IReservedService {

	public List<Reserved> getAllReservations();
	
}
