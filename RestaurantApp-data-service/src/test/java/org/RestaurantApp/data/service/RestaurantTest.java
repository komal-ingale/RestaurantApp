package org.RestaurantApp.data.service;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.RestaurantApp.common.entity.Restaurant;
import org.RestaurantApp.data.service.layer.Restaurantservice;
import org.junit.Test;

import junit.framework.TestCase;

public class RestaurantTest extends TestCase {

	@Test
	public static void createRestaurant() throws Exception {
		Restaurant restaurant = new Restaurant();
		restaurant.setName("Casablanca Cafe");
		restaurant.setBar(true);
		Path path = Paths.get("C:/Users/Komal/Downloads/restaurant.jpg");
		byte[] data = Files.readAllBytes(path);
		restaurant.setImage(data);
		Restaurantservice.getInstance().createRestaurant(restaurant);
		assertTrue(true);
	}

	public static void main(String[] args) throws Exception {
		createRestaurant();
	}
}
