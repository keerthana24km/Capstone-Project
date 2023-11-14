package com.hcl.rentaplace.repository;

/*
 * Author: Keerthana
 * Date: 18/01/2023
 */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.rentaplace.entity.Property;

@Repository
public interface IOwnerPropertyOpsRepository extends JpaRepository<Property , Long>{

}
