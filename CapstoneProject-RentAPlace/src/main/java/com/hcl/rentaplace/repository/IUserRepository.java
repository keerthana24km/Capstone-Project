package com.hcl.rentaplace.repository;

/*
 * Author: Likitha
 * Date: 17/01/2023
 */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.rentaplace.entity.User;

@Repository
public interface IUserRepository extends JpaRepository<User,Long>{
	
}
