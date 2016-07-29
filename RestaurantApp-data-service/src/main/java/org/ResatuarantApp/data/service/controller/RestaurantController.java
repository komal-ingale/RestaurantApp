package org.ResatuarantApp.data.service.controller;

import java.util.ArrayList;
import java.util.List;

import org.RestaurantApp.common.entity.Restaurant;
import org.RestaurantApp.data.service.layer.Restaurantservice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<Restaurant> getRestaurant() {
		List<Restaurant> allRestaurant = new ArrayList<Restaurant>();
		try {
			allRestaurant = Restaurantservice.getInstance().getAllRestaurants();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return allRestaurant;

	}

	// @RequestMapping(value = "/add", method = RequestMethod.POST)
	//
	// public @ResponseBody Restaurant addRestaurant(@RequestBody Restaurant
	// restaurant) {
	//
	// // do business logic
	// try {
	// Restaurantservice.getInstance().createRestaurant(restaurant);
	// } catch (Exception e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// return restaurant;
	// }
}
