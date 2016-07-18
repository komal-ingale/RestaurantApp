package org.RestaurantApp.common.entity;

public enum ItemEnum {
	STARTER("Starter"), MAIN_COURSE("Main Course"), SIDE_DISH("Sides");

	private String type;

	private ItemEnum(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

}
