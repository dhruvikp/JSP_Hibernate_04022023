package com.simplilearn.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.simplilearn.entity.Employee;

public class HibernateUtil {

	private static SessionFactory sessionFactory;

	public static SessionFactory buildSessionFactory() {
		if (sessionFactory == null) {
			Configuration config = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class);
			sessionFactory = config.buildSessionFactory();
		}
		return sessionFactory;
	}
}
