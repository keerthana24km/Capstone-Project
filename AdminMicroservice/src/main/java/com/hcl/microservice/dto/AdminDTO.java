package com.hcl.microservice.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AdminDTO {
	


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long AdminId;
	
	private String adminName;
	
	private String adminPassword;
	
	private String emailId;
	
	private long adminMobNo;

	public AdminDTO() {
		super();
	}

	public long getAdminId() {
		return AdminId;
	}

	public void setAdminId(long adminId) {
		AdminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public long getAdminMobNo() {
		return adminMobNo;
	}

	public void setAdminMobNo(long adminMobNo) {
		this.adminMobNo = adminMobNo;
	}

	@Override
	public String toString() {
		return "Admin [AdminId=" + AdminId + ", adminName=" + adminName + ", adminPassword=" + adminPassword
				+ ", emailId=" + emailId + ", adminMobNo=" + adminMobNo + "]";
	}
	
	
	
}
