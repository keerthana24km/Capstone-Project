package com.hcl.userreviewmicroservice.service;

/*
 * Author: Mounisha
 * Date: 18/01/2023
 */

import java.util.List;

import com.hcl.userreviewmicroservice.dto.UserReviewDto;
import com.hcl.userreviewmicroservice.entity.UserReview;

public interface IUserReviewService {

	public List<UserReview> getAllReviews();
	public UserReview addReview(UserReviewDto userReview);
	public UserReview getReviewById(Long userReviewId);
}
