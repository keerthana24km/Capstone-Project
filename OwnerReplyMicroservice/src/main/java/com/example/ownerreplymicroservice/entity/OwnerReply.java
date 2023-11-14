package com.example.ownerreplymicroservice.entity;

/*
 * Author: Keerthana
 * Date: 18/01/2023
 */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="ownerreply")
@Data
public class OwnerReply {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long replyId;
	private long userId;
	private long ownerId;
	private String userReview;
	private String ownerReply;
	
	public OwnerReply() {}

	public OwnerReply(long replyId, long userId, long ownerId, String userReview, String ownerReply) {
		super();
		this.replyId = replyId;
		this.userId = userId;
		this.ownerId = ownerId;
		this.userReview = userReview;
		this.ownerReply = ownerReply;
	}

	public long getReplyId() {
		return replyId;
	}

	public void setReplyId(long replyId) {
		this.replyId = replyId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public long getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(long ownerId) {
		this.ownerId = ownerId;
	}

	public String getUserReview() {
		return userReview;
	}

	public void setUserReview(String userReview) {
		this.userReview = userReview;
	}

	public String getOwnerReply() {
		return ownerReply;
	}

	public void setOwnerReply(String ownerReply) {
		this.ownerReply = ownerReply;
	}

	@Override
	public String toString() {
		return "OwnerReply [replyId=" + replyId + ", userId=" + userId + ", ownerId=" + ownerId + ", userReview="
				+ userReview + ", ownerReply=" + ownerReply + "]";
	}
	
}
