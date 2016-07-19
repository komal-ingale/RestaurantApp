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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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

	@OneToMany(mappedBy = "restaurant")
	private List<RestaurantTable> tables = new ArrayList<RestaurantTable>();

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

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "address_id")
	private Address address;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "menu_id")
	private Menu menu;

	@Column(name = "time_slot_type")
	@Enumerated(EnumType.STRING)
	private TimeSlotTypeEnum timeSlotType;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CuisineTypeEnum getCuisineType() {
		return cuisineType;
	}

	public void setCuisineType(CuisineTypeEnum cuisineType) {
		this.cuisineType = cuisineType;
	}

	public boolean isBar() {
		return isBar;
	}

	public void setBar(boolean isBar) {
		this.isBar = isBar;
	}

	public PaymentOptionEnum getPaymentOption() {
		return PaymentOption;
	}

	public void setPaymentOption(PaymentOptionEnum paymentOption) {
		PaymentOption = paymentOption;
	}

	public String getRange() {
		return range;
	}

	public void setRange(String range) {
		this.range = range;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public boolean isVeg() {
		return isVeg;
	}

	public void setVeg(boolean isVeg) {
		this.isVeg = isVeg;
	}

	public boolean isKitchenSeparate() {
		return isKitchenSeparate;
	}

	public void setKitchenSeparate(boolean isKitchenSeparate) {
		this.isKitchenSeparate = isKitchenSeparate;
	}

	public boolean isParkingAvailable() {
		return isParkingAvailable;
	}

	public void setParkingAvailable(boolean isParkingAvailable) {
		this.isParkingAvailable = isParkingAvailable;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<RestaurantTable> getTables() {
		return tables;
	}

	public void setTables(List<RestaurantTable> tables) {
		this.tables = tables;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public TimeSlotTypeEnum getTimeSlotType() {
		return timeSlotType;
	}

	public void setTimeSlotType(TimeSlotTypeEnum timeSlotType) {
		this.timeSlotType = timeSlotType;
	}

}
