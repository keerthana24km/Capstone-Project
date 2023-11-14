package com.hcl.microservice.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.microservice.entities.Reserved;
import com.hcl.microservice.services.ReservedService;


@RestController
@RequestMapping("/api/reserved")
public class ReservedController {

	@Autowired
	ReservedService reservedService;
	
	@GetMapping("reserved/getAllReservations")
	public List<Reserved> getAllReservations(){
		return reservedService.getAllReservations();
	}
}