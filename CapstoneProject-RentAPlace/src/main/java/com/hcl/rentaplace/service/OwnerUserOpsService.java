package com.hcl.rentaplace.service;

/*
 * Author: Likitha
 * Date: 18/01/2023
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.rentaplace.entity.User;
import com.hcl.rentaplace.exception.OwnerNotFoundException;
import com.hcl.rentaplace.repository.IOwnerUserOpsRepository;

@Service
public class OwnerUserOpsService implements IOwnerUserOpsService{

	@Autowired
	IOwnerUserOpsRepository ownerUserRepo;

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return ownerUserRepo.findAll();
	}

	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		ownerUserRepo.save(user);
		return ownerUserRepo.save(user);
	}

	@Override
	public String updateUser(Long userId, User user) {
		// TODO Auto-generated method stub
		String result = "";
		User usr = ownerUserRepo.findById(userId).orElse(null);
		if(usr!=null) {
			usr.setUserId(user.getUserId());
			usr.setUserName(user.getUserName());
			usr.setUserEmail(user.getUserEmail());
			usr.setUserPassword(user.getUserPassword());
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
	public String deleteUserById(Long userId) {
		// TODO Auto-generated method stub
		ownerUserRepo.deleteById(userId);
		return "Ddletion Successful!";
	}

	@Override
	public User searchUserById(Long userId) {
		// TODO Auto-generated method stub
		return ownerUserRepo.findById(userId).orElse(null);
	}
	
}
