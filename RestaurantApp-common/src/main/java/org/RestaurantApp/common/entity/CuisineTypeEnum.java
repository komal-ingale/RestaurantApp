package org.RestaurantApp.common.entity;

public enum CuisineTypeEnum {
	ITALIAN("Italian"), NORTH_INDAIAN("North Indian");

	private String description;

	private CuisineTypeEnum(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

}
