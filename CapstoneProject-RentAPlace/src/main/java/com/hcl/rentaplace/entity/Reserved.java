package com.hcl.rentaplace.entity;

/*
 * Author: Keerthana
 * Date: 17/01/2023
 */

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "reserved")
@IdClass(ReservedId.class)
public class Reserved {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long propertyId;
	private Date checkIn;
	private Date checkOut;

	public Reserved() {
	}

	public Reserved(Long userId, Long propertyId, Date checkIn, Date checkOut) {
		super();
		this.userId = userId;
		this.propertyId = propertyId;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(Long propertyId) {
		this.propertyId = propertyId;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(Date checkIn) {
		this.checkIn = checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(Date checkOut) {
		this.checkOut = checkOut;
	}

	@Override
	public String toString() {
		return "Reserved [userId=" + userId + ", propertyId=" + propertyId + ", checkIn=" + checkIn + ", checkOut="
				+ checkOut + "]";
	}

}
