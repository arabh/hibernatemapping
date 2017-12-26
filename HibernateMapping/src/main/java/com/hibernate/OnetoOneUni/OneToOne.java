package com.hibernate.OnetoOneUni;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.mapping.util.HibernateUtil;

public class OneToOne {

	public static void main(String[] args) {

		Address ad1 = new Address(101, "Icegard", 412408);
		Student s1 = new Student(10, "Thor", ad1);
		Address ad2 = new Address(102, "NY", 412207);
		Student s2 = new Student(20, "IronMan", ad2);
		
		Session session = HibernateUtil.getSessionFactory("hibernate.cfg.xml").openSession();
		Transaction tranc = session.beginTransaction();	
		
		s1.setId(ad1.getAddId());
		s2.setId(ad2.getAddId());
		
		session.save(s1);
		session.save(s2);

		tranc.commit();
		session.close();
	}

}
