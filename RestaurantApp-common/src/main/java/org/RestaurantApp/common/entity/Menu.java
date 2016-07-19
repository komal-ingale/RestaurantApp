package org.RestaurantApp.common.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 
 * @author Prakash
 *
 */
@Entity
@javax.persistence.Table(name = "menu")
public class Menu {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	// @Column(name = "restaurant_id")
	// @OneToOne(fetch = FetchType.LAZY, mappedBy = "menu", cascade =
	// CascadeType.REMOVE)
	// private Restaurant restaurant;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// public Restaurant getRestaurant() {
	// return restaurant;
	// }
	//
	// public void setRestaurant(Restaurant restaurant) {
	// this.restaurant = restaurant;
	// }

}
