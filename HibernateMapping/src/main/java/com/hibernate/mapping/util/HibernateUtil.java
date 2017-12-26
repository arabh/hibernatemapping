package com.hibernate.mapping.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	static Configuration cfg = null;
	static SessionFactory factory = null;

	public static SessionFactory getSessionFactory(String hibConfName) {
		if (null == factory) {
			try {
				// creating configuration object
				cfg = new Configuration();

				// populates the data of the configuration file
				cfg.configure(hibConfName);

				// creating seession factory object
				factory = cfg.buildSessionFactory();

			} catch (Exception e) {
				System.out.println("Hibernate Configuration Error!!");
			}
		}
		return factory;
	}
}
