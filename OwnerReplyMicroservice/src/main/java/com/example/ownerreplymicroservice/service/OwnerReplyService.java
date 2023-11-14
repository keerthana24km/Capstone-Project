package com.example.ownerreplymicroservice.service;

/*
 * Author: Keerthana
 * Date: 18/01/2023
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.ownerreplymicroservice.dto.UserReviewDto;
import com.example.ownerreplymicroservice.entity.OwnerReply;
import com.example.ownerreplymicroservice.repository.IOwnerReplyRepository;
import com.example.ownerreplymicroservice.vo.UserOwnerVo;

@Service
public class OwnerReplyService implements IOwnerReplyService{

	@Autowired
	IOwnerReplyRepository ownerReplyRepo;
	
	@Autowired
	RestTemplate restTemplate;

	@Override
	public UserOwnerVo addOwnerReplyToUserReview(Long userId,OwnerReply ownerReply) {
		// TODO Auto-generated method stub
		ResponseEntity<UserReviewDto> review = restTemplate.getForEntity("http://localhost:8484/api/userReview/getById/"+userId, UserReviewDto.class);
		UserReviewDto reviewResult = review.getBody();
		if(reviewResult.getUserId() == userId) {
			ownerReplyRepo.save(ownerReply);
		}
		UserOwnerVo userOwner = new UserOwnerVo(reviewResult,ownerReply);
		return userOwner;
	}
	
}
