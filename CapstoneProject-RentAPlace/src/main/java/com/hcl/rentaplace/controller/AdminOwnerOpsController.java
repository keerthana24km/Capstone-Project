package com.hcl.rentaplace.controller;

/*
 * Author: Keerthana
 * Date: 19/01/2023
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.rentaplace.entity.Owner;
import com.hcl.rentaplace.service.AdminOwnerOpsService;

@CrossOrigin
@RestController
@RequestMapping("/api/admin")
public class AdminOwnerOpsController {

	@Autowired
	AdminOwnerOpsService adminOwnerService;
	
	@GetMapping("/owner/getAllOwners")
  	public List<Owner> getAll(){
  		return adminOwnerService.getAllOwners();
  	}
  	
	@PostMapping("/owner/addOwner")
	public Owner addOwner(@RequestBody Owner owner) {
		return adminOwnerService.addOwner(owner);
	}
    
	@DeleteMapping("/owner/deleteOwnerById/{ownerId}")
  	public String deleteOwnerById(@PathVariable Long ownerId) {
  		return adminOwnerService.deleteOwnerById(ownerId);
  	}
	
	@PutMapping("/owner/updateOwner/{ownerId}")
	public String updateOwner(@PathVariable Long ownerId,@RequestBody Owner owner) {
		return adminOwnerService.updateOwner(ownerId, owner);
	}
	
	@GetMapping("/owner/getOwnerById/{ownerId}")
	public Owner getOwnerById(@PathVariable Long ownerId) {
		return adminOwnerService.getOwnerById(ownerId);
	}
}
