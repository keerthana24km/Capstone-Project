package com.hcl.microservice.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;


import com.hcl.microservice.entities.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	public Optional<User> findByUserNameAndUserPassword(String userName, String userPassword);
	
	
}

