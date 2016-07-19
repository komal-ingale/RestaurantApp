package org.RestaurantApp.common.entity;

public enum GenderEnum {
	Male("Male"), FEMALE("Female");
	private String description;

	private GenderEnum(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

}
