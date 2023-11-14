package com.hcl.rentaplace.service;

/*
 * Author: Likitha
 * Date: 18/01/2023
 */

import java.util.List;

import com.hcl.rentaplace.entity.User;

public interface IOwnerUserOpsService {

	public List<User> getAllUsers();
	public User addUser(User user);
	public String updateUser(Long userId, User user);
	public String deleteUserById(Long userId) ;
	public User searchUserById(Long userId);
}
