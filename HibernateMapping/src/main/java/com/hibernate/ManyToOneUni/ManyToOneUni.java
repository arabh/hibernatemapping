package com.hibernate.ManyToOneUni;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.mapping.util.HibernateUtil;

public class ManyToOneUni {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory("hibernate.cfg.xml").openSession();
		Transaction tranc = session.beginTransaction();	
		
		Company comp = new Company(10, "Marvel");

		Employee emp1 = new Employee(101, "Flash", comp);
		Employee emp2 = new Employee(102, "Hulk", comp);
		Employee emp3 = new Employee(103, "Thor", comp);
		Employee emp4 = new Employee(104, "Lovki", comp);
		Employee emp5 = new Employee(105, "Batman", comp);

		

		session.save(emp1);
		session.save(emp2);
		session.save(emp3);
		session.save(emp4);
		session.save(emp5);
		
		tranc.commit();
		session.close();

	}

}
