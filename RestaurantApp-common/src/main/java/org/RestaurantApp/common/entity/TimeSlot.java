package org.RestaurantApp.common.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/****
 * 
 * @author Komal
 *
 */
@Entity
@Table(name = "timeslot")
public class TimeSlot {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	@Column(name = "start_time")
	private String startTime;

	@Column(name = "end_time")
	private String endTime;

	@Column(name = "is_available")
	private boolean isAvailable;

	// @ManyToOne(fetch = FetchType.LAZY)
	// @JoinColumn(name = "restaurant_id", nullable = false)
	// private Restaurant restaurants;

	// @OneToMany(targetEntity = Reservation.class, mappedBy =
	// "reservationId.timeSlot")
	// private List<Reservation> reservations = new ArrayList<Reservation>();

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	// public Restaurant getRestaurants() {
	// return restaurants;
	// }
	//
	// public void setRestaurants(Restaurant restaurants) {
	// this.restaurants = restaurants;
	// }

	// public List<Reservation> getReservations() {
	// return reservations;
	// }
	//
	// public void setReservations(List<Reservation> reservations) {
	// this.reservations = reservations;
	// }

}
