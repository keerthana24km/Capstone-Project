package com.example.ownerreplymicroservice.vo;

/*
 * Author: Keerthana
 * Date: 18/01/2023
 */

import com.example.ownerreplymicroservice.dto.UserReviewDto;
import com.example.ownerreplymicroservice.entity.OwnerReply;

import lombok.Data;

@Data
public class UserOwnerVo {

	private UserReviewDto user;
	private OwnerReply owner;
	
	public UserOwnerVo() {}

	public UserOwnerVo(UserReviewDto user, OwnerReply owner) {
		super();
		this.user = user;
		this.owner = owner;
	}

	public UserReviewDto getUser() {
		return user;
	}

	public void setUser(UserReviewDto user) {
		this.user = user;
	}

	public OwnerReply getOwner() {
		return owner;
	}

	public void setOwner(OwnerReply owner) {
		this.owner = owner;
	}
	
}
