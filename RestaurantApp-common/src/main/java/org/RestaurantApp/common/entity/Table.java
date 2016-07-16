package org.RestaurantApp.common.entity;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * 
 * @author Prakash
 *
 */
public class Table {
	@Column(name = "capacity")
	private int capacity;

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public SeatingTypeEnum getTableType() {
		return tableType;
	}

	public void setTableType(SeatingTypeEnum tableType) {
		this.tableType = tableType;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	// enum type
	@Column(name = "is_available")
	private boolean isAvailable;

	@Column(name = "table_type")
	@Enumerated(EnumType.STRING)
	private SeatingTypeEnum tableType;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "restaurant_id", nullable = false)
	private Restaurant restaurant;

}
