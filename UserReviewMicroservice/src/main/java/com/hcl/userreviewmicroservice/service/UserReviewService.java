package com.hcl.userreviewmicroservice.service;

/*
 * Author: Mounisha
 * Date: 18/01/2023
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.userreviewmicroservice.dto.UserReviewDto;
import com.hcl.userreviewmicroservice.entity.UserReview;
import com.hcl.userreviewmicroservice.repository.UserReviewRepository;

@Service
public class UserReviewService implements IUserReviewService {

	@Autowired
	UserReviewRepository userReviewRepo;
	
	@Override
	public List<UserReview> getAllReviews() {
		// TODO Auto-generated method stub
		return userReviewRepo.findAll();
	}

	@Override
	public UserReview addReview(UserReviewDto userReview) {
		// TODO Auto-generated method stub
		UserReview review = new UserReview();
		review.setUserId(userReview.getUserId());
		review.setUserName(userReview.getUserName());
		review.setComment(userReview.getComment());
		return review;
	}

	@Override
	public UserReview getReviewById(Long userReviewId) {
		// TODO Auto-generated method stub
		return userReviewRepo.findById(userReviewId).orElse(null);
	}

}
