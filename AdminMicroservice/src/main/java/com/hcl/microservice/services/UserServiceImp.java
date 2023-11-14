package com.hcl.microservice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.hcl.microservice.entities.User;
import com.hcl.microservice.repositories.UserRepository;





@Service
public class UserServiceImp implements IUserService {
	@Autowired
	private UserRepository repo;
	
	public User Register(User user) {
		return repo.save(user);

	}
	
	public User login(String userName,String userPassword)
	{
		return repo.findByUserNameAndUserPassword(userName,userPassword).orElse(null);
	}
	

	
	  
	  public List<User> getAll(){
		  return (List<User>) repo.findAll();
	  }
	  
	  public User update1(long id, User user) {
		  User user1 = repo.findById(id).get();
		  user1.setUserName(user.getUserName());
		  user1.setEmailId(user.getEmailId());
		  user1.setUserPassword(user.getUserPassword());
		  
			return repo.save(user1);
	  }
	 
	  public void delete(User user) {
		  repo.delete(user);
	  }
	  public Optional<User> get(Long userId){
		  return repo.findById(userId);
	  }

	@Override
	public User update(long id, User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserByUserName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<String> registerUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}