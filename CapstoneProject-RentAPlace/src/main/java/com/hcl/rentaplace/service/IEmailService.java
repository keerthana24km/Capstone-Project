package com.hcl.rentaplace.service;

/*
 * Author: Keerthana
 * Date: 19/01/2023
 */

import com.hcl.rentaplace.entity.EmailDetails;

public interface IEmailService {

	public String reservationResponse(EmailDetails email);
}
