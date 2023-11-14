package com.example.ownerreplymicroservice.controller;

/*
 * Author: Keerthana
 * Date: 18/01/2023
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ownerreplymicroservice.entity.OwnerReply;
import com.example.ownerreplymicroservice.service.OwnerReplyService;
import com.example.ownerreplymicroservice.vo.UserOwnerVo;

@RestController
@RequestMapping("/api")
public class OwnerReplyController {
	
	@Autowired
	OwnerReplyService ownerReplyService;
	
	@PostMapping("/ownerReply/addOwnerReply/{userId}")
	public UserOwnerVo addOwnerReplyToUserReview(@PathVariable Long userId,@RequestBody OwnerReply ownerReply) {
		return ownerReplyService.addOwnerReplyToUserReview(userId, ownerReply);
	}
}
