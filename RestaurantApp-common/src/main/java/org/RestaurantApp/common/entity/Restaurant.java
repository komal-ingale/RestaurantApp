package org.RestaurantApp.common.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author Prakash
 *
 */
@Entity
@Table(name = "restaurant")

public class Restaurant {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;
	// type
	@Column(name = "cuisine_type")
	@Enumerated(EnumType.STRING)
	private CuisineTypeEnum cuisineType;
	
	@Column(name = "is_bar")
	private boolean isBar;

	// paymenttype
	@Column(name = "payment_method")
	@Enumerated(EnumType.STRING)
	private PaymentOptionEnum PaymentOption;

	@Column(name = "price_range")
	private String range;

	@Column(name = "speciality")
	private String speciality;

	@Column(name = "is_veg")
	private boolean isVeg;

	// kitchen type
	@Column(name = "is_kitchen_separate")
	private boolean isKitchenSeparate;

	@Column(name = "is_parking_available")
	private boolean isParkingAvailable;

	@Column(name = "discount")
	private String discount;

}
