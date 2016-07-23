package org.RestaurantApp.data.persistent.layer.dao;

import java.util.List;

import org.RestaurantApp.common.entity.Restaurant;
import org.RestaurantApp.data.persistence.layer.util.HibernateUtil;
import org.RestaurantApp.data.persistent.layer.service.Restaurantservice;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class RestaurantDao {
	private static RestaurantDao restaurantDao;
	final static Logger logger = Logger.getLogger(Restaurantservice.class);

	/*
	 * A private Constructor prevents any other class from instantiating.
	 */
	private RestaurantDao() {
	}

	/* Static 'instance' method */
	public static RestaurantDao getInstance() {
		if (restaurantDao == null)
			restaurantDao = new RestaurantDao();
		return restaurantDao;
	}

	public void createRestaurant(Restaurant restaurant) throws HibernateException, Exception {
		logger.info("Entering RestaurantDao createRestaurant");
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		sessionFactory.getCurrentSession().save(restaurant);
		logger.info("Leaving RestaurantDao createRestaurant");
	}

	public List<Restaurant> getAllRestaurants() {
		logger.info("Entering RestaurantDao getAllRestaurants");
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		String hql = "FROM restaurant";
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(hql);
		List<Restaurant> results = query.list();
		if (results.isEmpty()) {
			logger.info("No Restaurants retrieved from Restaurant table.");

		} else {

			logger.info("No.of ChanRestaurantsnels retrieved from DB:  " + results.size());
		}
		logger.info("Leaving RestaurantDao getAllRestaurants");
		return results;

	}

}
