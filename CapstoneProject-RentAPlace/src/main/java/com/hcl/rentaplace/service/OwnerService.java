package com.hcl.rentaplace.service;

/*
 * Author: Likitha
 * Date: 17/01/2023
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.rentaplace.entity.Owner;
import com.hcl.rentaplace.exception.OwnerNotFoundException;
import com.hcl.rentaplace.repository.IOwnerRepository;

@Service
public class OwnerService implements IOwnerService{
	
	@Autowired
	private IOwnerRepository repo;
	
	
	public String Register( Owner owner) {
		repo.save(owner);
		return "Registration Successful!";
	}

	public String login(Owner owner) {
		List<Owner> owners = repo.findAll();
		String result = "";
		for(Owner o:owners) {
			if(owner.getOwnerId()==o.getOwnerId() && owner.getOwnerPassword().equals(o.getOwnerPassword())) {
				result = "Login Successful!";
				break;
			}else {
				try {
					throw new OwnerNotFoundException();
				}catch(OwnerNotFoundException onfe) {
					result = "Owner Not Found!";
				}
			}
		}
		return result;
	}
	
}
