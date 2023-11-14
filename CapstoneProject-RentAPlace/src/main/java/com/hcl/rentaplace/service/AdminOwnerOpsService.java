package com.hcl.rentaplace.service;

/*
 * Author: Keerthana
 * Date: 19/01/2023
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.rentaplace.entity.Owner;
import com.hcl.rentaplace.exception.OwnerNotFoundException;
import com.hcl.rentaplace.repository.IAdminOwnerOpsRepository;

@Service
public class AdminOwnerOpsService implements IAdminOwnerOpsService{

	@Autowired
	IAdminOwnerOpsRepository adminOwnerRepo;
	
	@Override
	public List<Owner> getAllOwners() {
		// TODO Auto-generated method stub
		return adminOwnerRepo.findAll();
	}

	@Override
	public Owner addOwner(Owner owner) {
		// TODO Auto-generated method stub
		adminOwnerRepo.save(owner);
		return adminOwnerRepo.save(owner);
	}

	@Override
	public String deleteOwnerById(Long ownerId) {
		// TODO Auto-generated method stub
		adminOwnerRepo.deleteById(ownerId);
		return "Deletion Successful!";
	}

	@Override
	public String updateOwner(Long ownerId, Owner owner) {
		// TODO Auto-generated method stub
		String result = "";
		Owner own = adminOwnerRepo.findById(ownerId).orElse(null);
		if(own!=null) {
			own.setOwnerId(owner.getOwnerId());
			own.setOwnerName(owner.getOwnerName());
			own.setOwnerEmail(owner.getOwnerEmail());
			own.setOwnerPassword(owner.getOwnerPassword());
			result = "Updation Successful!";
		}else {
			try {
				throw new OwnerNotFoundException();
			}catch(OwnerNotFoundException onfe) {
				result = "Owner Not Found...";
			}
		}
		return result;
	}

	@Override
	public Owner getOwnerById(Long ownerId) {
		// TODO Auto-generated method stub
		return adminOwnerRepo.findById(ownerId).orElse(null);
	}
	
}
