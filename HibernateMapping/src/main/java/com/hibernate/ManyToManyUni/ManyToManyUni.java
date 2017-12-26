package com.hibernate.ManyToManyUni;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.mapping.util.HibernateUtil;

public class ManyToManyUni {

	public static void main(String[] args) {

		Session session = HibernateUtil.getSessionFactory("hibernate.cfg.xml").openSession();
		Transaction tranc = session.beginTransaction();

		Authors a1 = new Authors(10, "Hulk");
		Authors a2 = new Authors(20, "Thor");

		List<Authors> list1 = new ArrayList<Authors>();
		list1.add(a1);
		list1.add(a2);

		Books book = new Books(101, "Thor: Rangrock", list1);

		session.save(book);

		tranc.commit();

		session.close();
	}

}
