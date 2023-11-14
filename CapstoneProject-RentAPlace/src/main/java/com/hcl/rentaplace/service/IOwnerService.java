package com.hcl.rentaplace.service;

/*
 * Author: Likitha
 * Date: 17/01/2023
 */

import com.hcl.rentaplace.entity.Owner;

public interface IOwnerService {
	
	public String Register(Owner owner);
	public String login(Owner owner);

}
