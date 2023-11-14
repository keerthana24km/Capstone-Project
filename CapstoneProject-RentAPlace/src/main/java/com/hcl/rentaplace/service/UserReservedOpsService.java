package com.hcl.rentaplace.service;

/*
 * Author: Keerthana
 * Date: 19/01/2023
 */

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.rentaplace.entity.Reserved;
import com.hcl.rentaplace.exception.ReservationNotFoundException;
import com.hcl.rentaplace.repository.IUserReservedOpsRepository;

@Service
public class UserReservedOpsService implements IUserReservedOpsService{

	@Autowired
	IUserReservedOpsRepository userResvRepo;

	@Override
	public List<Reserved> getAllReservations() {
		// TODO Auto-generated method stub
		return userResvRepo.findAll();
	}

	@Override
	public Reserved addToReserved(Reserved reservation) {
		// TODO Auto-generated method stub
		Reserved resv = new Reserved(reservation.getUserId(),reservation.getPropertyId(),reservation.getCheckIn(),reservation.getCheckOut());
		return resv;
	}

	@Override
	public String deleteFromReservedById(Long propertyId) {
		// TODO Auto-generated method stub
		userResvRepo.deleteById(propertyId);
		return "Deletion Successful!";
	}

	@Override
	public String updateToReserved(Long propertyId, Date checkIn, Date checkOut) {
		// TODO Auto-generated method stub
		Reserved resv = userResvRepo.findById(propertyId).orElse(null);
		String result = "";
		if(resv!=null) {
			resv.setCheckIn(checkIn);
			resv.setCheckOut(checkOut);
			result = "Updation Successful!";
		}else {
			try {
				throw new ReservationNotFoundException();
			}catch(ReservationNotFoundException rnfe) {
				result = "Reservation not found...";
			}
		}
		return result;
	}

	@Override
	public Reserved searchInReserved(Long propertyId) {
		// TODO Auto-generated method stub
		return userResvRepo.findById(propertyId).orElse(null);
	}
}
