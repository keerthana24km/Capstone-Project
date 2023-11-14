package com.hcl.rentaplace.service;

/*
 * Author: Keerthana
 * Date: 19/01/2023
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.hcl.rentaplace.entity.EmailDetails;

@Service
public class EmailService implements IEmailService{

	@Autowired
	JavaMailSender sendMail;
	
	@Override
	public String reservationResponse(EmailDetails email) {
		// TODO Auto-generated method stub
		try {
			SimpleMailMessage emailDet = new SimpleMailMessage();
			String sender = "capstone2023team4@gmail.com";
			emailDet.setFrom(sender);
			emailDet.setTo(email.getRecipient());
			emailDet.setText(email.getMessage());
			emailDet.setSubject(email.getSubject());
			sendMail.send(emailDet);
			return "Email Sent Successfully!";
		}catch(Exception e){
			return "Error while sending the mail...";
		}
	}

}
