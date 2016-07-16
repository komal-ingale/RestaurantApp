package org.RestaurantApp.common.entity;

public enum PaymentOptionEnum {
	VISA("Visa"), MASTER("Master Card"), AMERICAN("AMEX");
	private String description;

	private PaymentOptionEnum(String description) {
		this.description=description;

	}

	public String getDescription() {
		return description;
	}


}
