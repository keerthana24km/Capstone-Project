package com.hcl.microservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.microservice.entities.Property;


@Repository
public interface IPropertyRepository extends JpaRepository<Property , Long>{

}
