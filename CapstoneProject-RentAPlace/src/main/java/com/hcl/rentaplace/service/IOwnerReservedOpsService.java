package com.hcl.rentaplace.service;

/*
 * Author: Keerthana
 * Date: 19/01/2023
 */

import java.util.List;

import com.hcl.rentaplace.entity.Reserved;

public interface IOwnerReservedOpsService {

	public List<Reserved> getAllReservations();
	
}
