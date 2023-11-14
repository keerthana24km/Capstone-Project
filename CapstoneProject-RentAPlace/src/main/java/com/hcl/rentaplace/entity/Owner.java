package com.hcl.rentaplace.entity;

/*
 * Author: Likitha
 * Date: 17/01/2023
 */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="owner")
public class Owner {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long ownerId;
	private String ownerEmail;
	private String ownerName;
	private String ownerPassword;

	public Owner() {

	}

	public Owner(long ownerId, String ownerName, String ownerPassword, String ownerEmail) {
		super();
		this.ownerId = ownerId;
		this.ownerName = ownerName;
		this.ownerPassword = ownerPassword;
		this.ownerEmail = ownerEmail;
	}

	public long getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(long ownerId) {
		this.ownerId = ownerId;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getOwnerPassword() {
		return ownerPassword;
	}

	public void setOwnerPassword(String ownerPassword) {
		this.ownerPassword = ownerPassword;
	}

	public String getOwnerEmail() {
		return ownerEmail;
	}

	public void setOwnerEmail(String ownerEmail) {
		this.ownerEmail = ownerEmail;
	}

	@Override
	public String toString() {
		return "Owner [ownerId=" + ownerId + ", ownerName=" + ownerName + ", ownerPassword=" + ownerPassword
				+ ", ownerEmail=" + ownerEmail + "]";
	}

}
