package com.hcl.rentaplace.service;

/*
 * Author: Likitha
 * Date: 17/01/2023
 */

import com.hcl.rentaplace.entity.User;

public interface IUserService {

	public String Register(User user);
	public String login(User user);
}
