package com.hcl.userreviewmicroservice.controller;

/*
 * Author: Mounisha
 * Date: 18/01/2023
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.userreviewmicroservice.dto.UserReviewDto;
import com.hcl.userreviewmicroservice.entity.UserReview;
import com.hcl.userreviewmicroservice.service.IUserReviewService;

@RestController
@RequestMapping("/api")
public class UserReviewController {

	@Autowired
	IUserReviewService userReviewService;

	@GetMapping("/userReview/getAllReviews")
	public List<UserReview> getAllReviews(){
		return userReviewService.getAllReviews();
	}
	
	@PostMapping("/userReview/addReview")
	public UserReview addReview(@RequestBody UserReviewDto userReview) {
		return userReviewService.addReview(userReview);
	}
	
	@GetMapping("/userReview/getById/{userReviewId}")
	public UserReview getReviewById(@PathVariable Long userReviewId) {
		return userReviewService.getReviewById(userReviewId);
	}
}
