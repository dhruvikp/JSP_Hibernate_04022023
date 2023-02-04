package com.simplilearn.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.simplilearn.entity.Employee;
import com.simplilearn.util.HibernateUtil;

public class EmployeeDao {

	public static void addEmployee(Employee employee) {

		// STEP 1: Build Session Factory
		SessionFactory sessionFactory = HibernateUtil.buildSessionFactory();

		// STEP 2: open session object
		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();
		session.save(employee);
		tx.commit();

		session.close();
	}

	public static List<Employee> listEmployee() {
		SessionFactory sf = HibernateUtil.buildSessionFactory();
		Session session = sf.openSession();
		
		List<Employee> employees = session.createQuery("from Employee e").list();
		
		session.close();
		return employees;
		
		
	}
}