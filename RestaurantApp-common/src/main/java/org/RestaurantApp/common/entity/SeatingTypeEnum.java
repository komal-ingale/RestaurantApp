package org.RestaurantApp.common.entity;

public enum SeatingTypeEnum {
	AC("Air Conditioned"), NON_AC("Non Air Conditioned");
	private String type;

	public String getType() {
		return type;
	}

	private SeatingTypeEnum(String type) {
		this.type = type;
	}
}
