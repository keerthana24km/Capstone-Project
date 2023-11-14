package com.hcl.microservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.microservice.entities.Reserved;



@Repository
public interface IReservedRepository extends JpaRepository<Reserved, Long>{

}