package com.hcl.rentaplace.entity;

/*
 * Author: Keerthana
 * Date: 17/01/2023
 */

import java.io.Serializable;
import java.util.Objects;

public class ReservedId implements Serializable {

	private Long userId;
	private Long propertyId;

	public ReservedId(Long userId, Long propertyId) {
		super();
		this.userId = userId;
		this.propertyId = propertyId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(propertyId, userId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ReservedId other = (ReservedId) obj;
		return Objects.equals(propertyId, other.propertyId) && Objects.equals(userId, other.userId);
	}

}
