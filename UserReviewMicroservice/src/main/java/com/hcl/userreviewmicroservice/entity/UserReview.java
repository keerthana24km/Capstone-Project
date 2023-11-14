package com.hcl.userreviewmicroservice.entity;

/*
 * Author: Likitha
 * Date: 18/01/2023
 */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "userreview")
public class UserReview {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long userId;
	private String userName;
	private String comment;

	public UserReview() {
		super();
	}

	public UserReview(long userId, String userName, String comment) {
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
		return "UserReview [userId=" + userId + ", userName=" + userName + ", comment=" + comment + "]";
	}

}
