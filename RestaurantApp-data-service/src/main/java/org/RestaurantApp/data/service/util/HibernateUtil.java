package org.RestaurantApp.data.service.util;

import org.RestaurantApp.common.entity.Address;
import org.RestaurantApp.common.entity.Item;
import org.RestaurantApp.common.entity.Menu;
import org.RestaurantApp.common.entity.Reservation;
import org.RestaurantApp.common.entity.ReservationId;
import org.RestaurantApp.common.entity.Restaurant;
import org.RestaurantApp.common.entity.RestaurantTable;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;
import org.hibernate.tool.hbm2ddl.SchemaUpdate;

/**
 * 
 * @author Komal
 *
 */
public class HibernateUtil {

	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		try {
			Configuration config = new Configuration();

			config.addAnnotatedClass(Restaurant.class);
			config.addAnnotatedClass(RestaurantTable.class);
			config.addAnnotatedClass(Address.class);
			config.addAnnotatedClass(Menu.class);
			config.addAnnotatedClass(Item.class);
			config.addAnnotatedClass(Reservation.class);
			config.addAnnotatedClass(ReservationId.class);

			config.configure("Resources/hibernate.cfg.xml");
			new SchemaUpdate(config).execute(true, true);

			return config.buildSessionFactory(
					new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry());
		} catch (Throwable ex) {
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static void main(String[] args) {
		getSessionFactory();
	}
}