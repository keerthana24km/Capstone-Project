package com.hcl.rentaplace.service;

/*
 * Author: Likitha
 * Date: 17/01/2023
 */

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.rentaplace.entity.User;
import com.hcl.rentaplace.exception.UserNotFoundException;
import com.hcl.rentaplace.repository.IUserRepository;


@Service
public class UserService implements IUserService {
	
	@Autowired
	private IUserRepository repo;
	
	public String Register(User user) {
		repo.save(user);
		return "Registration Successful!";
	}
	
	public String login(User user)
	{
		List<User> users = repo.findAll();
		String result = "";
		for(User u:users) {
			if(u.getUserName().equals(user.getUserName()) && u.getUserPassword().equals(user.getUserPassword())) {
				result = "Login Successful!";
				break;
			}else {
				try {
					throw new UserNotFoundException();
				}catch(UserNotFoundException unfe) {
					result = "User Not Found...";
				}
			}
		}
		return result;
	}
	 
}

