package org.RestaurantApp.common.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

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

	@Column(name = "restaurant_id")
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "menu", cascade = CascadeType.REMOVE)
	private Restaurant restaurant;

	@Column(name = "description")
	private String description;

}
