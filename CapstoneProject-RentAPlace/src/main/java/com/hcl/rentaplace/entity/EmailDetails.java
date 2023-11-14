package com.hcl.rentaplace.entity;

/*
 * Author: Keerthana
 * Date: 19/01/2023
 */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="emaildet")
@Data
public class EmailDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String recipient;
	private String message;
	private String subject;
	
	public EmailDetails() {}

	public EmailDetails(String recepient, String message, String subject) {
		super();
		this.recipient = recepient;
		this.message = message;
		this.subject = subject;
	}

	public String getRecipient() {
		return recipient;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
}
