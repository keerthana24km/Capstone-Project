package com.hcl.rentaplace.entity;

/*
 * Author: Keerthana
 * Date: 17/01/2023
 */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "property")
public class Property {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long propertyId;
	private long ownerId;
	private double rating;
	private String address;
	private String city;
	private String propertyType;
	private String availability;
	private String amenities;

	public Property() {
	}

	public Property(long propertyId, long ownerId, double rating, String address, String city, String propertyType,
			String availability, String amenities) {
		super();
		this.propertyId = propertyId;
		this.ownerId = ownerId;
		this.rating = rating;
		this.address = address;
		this.city = city;
		this.propertyType = propertyType;
		this.availability = availability;
		this.amenities = amenities;
	}

	public long getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(long propertyId) {
		this.propertyId = propertyId;
	}

	public long getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(long ownerId) {
		this.ownerId = ownerId;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPropertyType() {
		return propertyType;
	}

	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}

	public String getAmenities() {
		return amenities;
	}

	public void setAmenities(String amenities) {
		this.amenities = amenities;
	}

	@Override
	public String toString() {
		return "Property [propertyId=" + propertyId + ", ownerId=" + ownerId + ", rating=" + rating + ", address="
				+ address + ", city=" + city + ", propertyType=" + propertyType + ", availability=" + availability
				+ ", amenities=" + amenities + "]";
	}

}
