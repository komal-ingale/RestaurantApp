package org.RestaurantApp.data.persistent.layer;

import org.RestaurantApp.common.entity.Restaurant;
import org.RestaurantApp.data.persistent.layer.service.Restaurantservice;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public AppTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp() {
		Restaurant restaurant = new Restaurant();
		restaurant.setName("KOMAL_IS_NOOB");
		try {
			Restaurantservice.getInstance().createRestaurant(restaurant);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			assertFalse(true);
			e.printStackTrace();
		}

		assertTrue(true);
	}
}
