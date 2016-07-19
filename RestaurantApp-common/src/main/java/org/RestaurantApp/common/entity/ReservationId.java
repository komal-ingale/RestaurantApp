package org.RestaurantApp.common.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class ReservationId implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2842691809791463179L;

	@ManyToOne
	private RestaurantTable table;

	private String timeStamp;

	public RestaurantTable getTable() {
		return table;
	}

	public void setTable(RestaurantTable table) {
		this.table = table;
	}

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

}
