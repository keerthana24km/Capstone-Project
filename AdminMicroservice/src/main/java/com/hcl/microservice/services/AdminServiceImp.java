package com.hcl.microservice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.hcl.microservice.dto.UserDTO;
import com.hcl.microservice.entities.Admin;
import com.hcl.microservice.entities.User;
import com.hcl.microservice.exceptions.AdminNotFoundException;
import com.hcl.microservice.repositories.AdminRepository;
import com.hcl.microservice.repositories.UserRepository;

@Service
public class AdminServiceImp implements IAdminService {

	
	@Autowired
	UserRepository userRepo;
	
	@Autowired
	AdminRepository adminRepo;
	
	

	@Override
	public User addUser(UserDTO userDto) {
		// TODO Auto-generated method stub
		
		
			
		User user = new User();
			
		

		user.setUserId(userDto.getUserId());
		user.setUserName(userDto.getUserName());
		user.setUserPassword(userDto.getUserPassword());
		user.setEmailId(userDto.getEmailId());
		user.setUserMobNo(userDto.getUserMobNo());
		
		return userRepo.save(user);
		
		
	}

	@Override
	public User updateUser(UserDTO userDto) {
		// TODO Auto-generated method stub
		User user = new User();
		user.setUserId(userDto.getUserId());
		user.setUserName(userDto.getUserName());
		user.setUserPassword(userDto.getUserPassword());
		user.setEmailId(userDto.getEmailId());
		user.setUserMobNo(userDto.getUserMobNo());
		return userRepo.save(user);
		
	}

	@Override
	public String deleteUserById(long userId) {
		// TODO Auto-generated method stub
		 userRepo.deleteById(userId);
		 
		 return "!USER DELETED!";
	}

	@Override
	public User getUserById(long userId) {
		// TODO Auto-generated method stub
		return userRepo.findById(userId).orElse(null);
	}

	@Override
	public List<User> displayUser(UserDTO userDto) {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

	@Override
	public ResponseEntity<String> registerAdmin(Admin admin) {
	ResponseEntity<String> response = null;
		
		Admin admin1 =  adminRepo.save(admin);
		
		if(admin1!=null) {
			response = new ResponseEntity<String>("Admin Registration Success",HttpStatus.ACCEPTED);
			
		}else {
			
			response = new ResponseEntity<String>("Admin Registration Failed!",HttpStatus.NOT_ACCEPTABLE);
		}
		return response;
		
	}

	@Override
    public Admin getAdminByAdminName(String adminName) throws AdminNotFoundException {
        int count = 0;
        if (count == 0) {

 

            try {
                throw new AdminNotFoundException();
            } catch (AdminNotFoundException e) {
                System.err.println("AdminNotFound");
            }
        }

 

        return adminRepo.findAdminByAdminName(adminName);
    }
	
}
