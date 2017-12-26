package com.hibernate.OnetoOneBi;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.mapping.util.HibernateUtil;

public class OneToOneBi {

	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory("hibernate.cfg.xml").openSession();
		Transaction tran = session.beginTransaction();
		
		AddressBi add = new AddressBi(1, "Iceguard", 000001, null);
		AddressBi add1 = new AddressBi(2, "NY", 000002, null);

		StudentBi stud = new StudentBi(10, "Lovki", add);
		StudentBi stud1 = new StudentBi(20, "Hulk", add1);		

		add.setStudentbi(stud);
		add1.setStudentbi(stud1);

		session.save(stud);
		session.save(stud1);

		tran.commit();
		session.close();

	}

}
