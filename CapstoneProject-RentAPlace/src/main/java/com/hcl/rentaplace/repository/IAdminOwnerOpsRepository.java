package com.hcl.rentaplace.repository;

/*
 * Author: Keerthana
 * Date: 19/01/2023
 */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.rentaplace.entity.Owner;

@Repository
public interface IAdminOwnerOpsRepository extends JpaRepository<Owner, Long>{

}
