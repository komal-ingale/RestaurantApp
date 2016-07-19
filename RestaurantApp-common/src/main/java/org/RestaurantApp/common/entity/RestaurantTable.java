package org.RestaurantApp.common.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 
 * @author Prakash
 *
 */
@Entity
@Table(name = "rest_table")
public class RestaurantTable {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	@Column(name = "capacity")
	private int capacity;

	@Column(name = "is_available")
	private boolean isAvailable;

	@Column(name = "table_type")
	@Enumerated(EnumType.STRING)
	private SeatingTypeEnum tableType;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "restaurant_id")
	private Restaurant restaurant;

	@OneToMany(targetEntity = Reservation.class, mappedBy = "reservationId.table")
	private List<Reservation> reservations = new ArrayList<Reservation>();

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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

}
