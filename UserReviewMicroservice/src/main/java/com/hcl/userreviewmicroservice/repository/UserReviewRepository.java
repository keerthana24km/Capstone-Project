package com.hcl.userreviewmicroservice.repository;

/*
 * Author: Mounisha
 * Date: 18/01/2023
 */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.userreviewmicroservice.entity.UserReview;

@Repository
public interface UserReviewRepository extends JpaRepository<UserReview, Long> {
	
}
