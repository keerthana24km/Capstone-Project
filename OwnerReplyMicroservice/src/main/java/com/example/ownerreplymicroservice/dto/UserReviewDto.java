package com.example.ownerreplymicroservice.dto;

/*
 * Author: Keerthana
 * Date: 18/01/2023
 */

import lombok.Data;

@Data
public class UserReviewDto {

	private long userId;
	private String userName;
	private String comment;

	public UserReviewDto() {
		super();
	}

	public UserReviewDto(long userId, String userName, String comment) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.comment = comment;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "UserReviewDTO [userId=" + userId + ", userName=" + userName + ", comment=" + comment + "]";
	}

}
