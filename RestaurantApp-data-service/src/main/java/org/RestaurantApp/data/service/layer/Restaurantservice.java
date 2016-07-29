package org.RestaurantApp.data.service.layer;

import java.util.List;

import org.RestaurantApp.common.entity.Restaurant;
import org.RestaurantApp.data.service.dao.RestaurantDao;
import org.RestaurantApp.data.service.util.HibernateSessionUtil;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;

public class Restaurantservice {
	private static Restaurantservice restaurantservice;
	final static Logger logger = Logger.getLogger(Restaurantservice.class);

	public static Restaurantservice getInstance() {
		if (restaurantservice == null)
			restaurantservice = new Restaurantservice();
		return restaurantservice;
	}

	public void createRestaurant(Restaurant restaurant) throws Exception {
		logger.info("Entering Restaurantservice ");
		SessionFactory sessionFactory = HibernateSessionUtil.getCurrentSessionTransaction();
		try {

			RestaurantDao.getInstance().createRestaurant(restaurant);
			sessionFactory.getCurrentSession().getTransaction().commit();
		} catch (HibernateException e) {
			logger.error(e.getMessage());
			sessionFactory.getCurrentSession().getTransaction().rollback();
			throw new Exception(e.getMessage());
		}
	}

	public List<Restaurant> getAllRestaurants() throws Exception {
		logger.info("Entering getAllRestaurants ");
		SessionFactory sessionFactory = HibernateSessionUtil.getCurrentSessionTransaction();
		try {

			List<Restaurant> allRestaurants = RestaurantDao.getInstance().getAllRestaurants();
			// sessionFactory.getCurrentSession().getTransaction().commit();
			return allRestaurants;
		} catch (HibernateException e) {
			logger.error(e.getMessage());
			sessionFactory.getCurrentSession().getTransaction().rollback();
			throw new Exception(e.getMessage());
		}
	}
}
