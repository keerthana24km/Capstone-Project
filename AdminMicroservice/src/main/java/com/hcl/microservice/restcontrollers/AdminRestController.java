package com.hcl.microservice.restcontrollers;

import java.util.List;



import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.microservice.dto.UserDTO;
import com.hcl.microservice.entities.Admin;
import com.hcl.microservice.entities.User;
import com.hcl.microservice.exceptions.AdminNotFoundException;
import com.hcl.microservice.services.IAdminService;

@RestController
@RequestMapping("/api/admin")
public class AdminRestController {
	
	@Autowired
	IAdminService adminService;
	
	

	
	@PostMapping("/AddUser")
	public User add(@RequestBody UserDTO userDto){
		
		return adminService.addUser(userDto);
		
		
	}
	
	@PutMapping("/UpdateUser")
	public User update(@RequestBody UserDTO userDto) {
		
		return adminService.updateUser(userDto);
		
	}
	
	@DeleteMapping("/DeleteUser/{userId}")
	public String deleteById(@PathVariable long userId) {
		
		return adminService.deleteUserById(userId);
	}
	
	@GetMapping("/GetUserById/{userId}")
	public User getById(@PathVariable long userId) {
		
		return adminService.getUserById(userId);
	}
	
	@GetMapping("/GetAllUsers")
	public List<User> getAll(UserDTO userDto){
		
		return adminService.displayUser(userDto);
		
		
	}
	

	
	 @PostMapping("/register")
		public ResponseEntity<String> register(@RequestBody Admin admin){
			
			return adminService.registerAdmin(admin);
			
		}
		
		@GetMapping("/login/{adminName}/{adminPassword}")
		public ResponseEntity<String> login(@PathVariable String adminName,@PathVariable String adminPassword,HttpSession session)
		throws AdminNotFoundException{
			
			Admin admin =  adminService.getAdminByAdminName(adminName);
		
			
			ResponseEntity<String> response = null;
			
			if(admin.getAdminName().equals(adminName)&& admin.getAdminPassword().equals(adminPassword)){
				
				session.setAttribute("adminName", adminName);
				session.setAttribute("adminPassword", adminPassword);
				
				
				response = new ResponseEntity<String>("Login Success!",HttpStatus.OK);
			}
			else {
				
				response = new ResponseEntity<String>("Login Failed!", HttpStatus.BAD_REQUEST);
			}
			return response;
			
		}
		
	
		
		
		@GetMapping("/logout")
	    public String logout(HttpSession session) {

	 

	        session.invalidate();

	 

	        return "Logout Success";

	 

	    }
	
	
	
	
}
