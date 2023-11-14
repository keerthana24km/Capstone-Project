package com.hcl.rentaplace.service;

/*
 * Author: Keerthana
 * Date: 19/01/2023
 */

import java.util.List;

import com.hcl.rentaplace.entity.Owner;

public interface IAdminOwnerOpsService {

	public List<Owner> getAllOwners();
	public Owner addOwner(Owner owner);
	public String deleteOwnerById(Long ownerId) ;
	public String updateOwner(Long ownerId,Owner owner);
	public Owner getOwnerById(Long ownerId);
}
