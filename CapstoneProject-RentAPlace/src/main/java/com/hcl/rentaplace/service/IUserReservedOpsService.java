package com.hcl.rentaplace.service;

/*
 * Author: Keerthana
 * Date: 19/01/2023
 */

import java.util.Date;
import java.util.List;

import com.hcl.rentaplace.entity.Reserved;

public interface IUserReservedOpsService {

	public List<Reserved> getAllReservations();
	public Reserved addToReserved(Reserved reservation);
	public String deleteFromReservedById(Long propertyId);
	public String updateToReserved(Long propertyId,Date checkIn,Date checkOut);
	public Reserved searchInReserved(Long propertyId);
}
