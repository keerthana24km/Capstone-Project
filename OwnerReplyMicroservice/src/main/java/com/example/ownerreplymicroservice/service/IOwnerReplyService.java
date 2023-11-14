package com.example.ownerreplymicroservice.service;

/*
 * Author: Keerthana
 * Date: 18/01/2023
 */

import com.example.ownerreplymicroservice.entity.OwnerReply;
import com.example.ownerreplymicroservice.vo.UserOwnerVo;

public interface IOwnerReplyService {
	
	public UserOwnerVo addOwnerReplyToUserReview(Long userId,OwnerReply ownerReply);
}
