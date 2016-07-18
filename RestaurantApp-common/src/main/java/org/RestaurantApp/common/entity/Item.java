package org.RestaurantApp.common.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * 
 * @author Prakash
 *
 */
@Entity
@javax.persistence.Table(name = "item")
public class Item {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "menu_id", nullable = false)
	private Menu menu;

	@Column(name = "item_name")
	private String itemName;

	@Column(name = "item_type")
	@Enumerated(EnumType.STRING)
	private ItemEnum itemType;

	@Column(name = "is_veg")
	private boolean isVeg;

}
