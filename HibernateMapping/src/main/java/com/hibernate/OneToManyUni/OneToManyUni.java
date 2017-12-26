package com.hibernate.OneToManyUni;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.mapping.util.HibernateUtil;

public class OneToManyUni {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory("hibernate.cfg.xml").openSession();
		Transaction tran = session.beginTransaction();
		
		StudentsOneToManyUni s1 = new StudentsOneToManyUni(10, "Hulk");
		StudentsOneToManyUni s2 = new StudentsOneToManyUni(20, "Thor");
		StudentsOneToManyUni s3 = new StudentsOneToManyUni(30, "IronMan");
		StudentsOneToManyUni s4 = new StudentsOneToManyUni(40, "BatMan");

		List<StudentsOneToManyUni> list1 = new ArrayList<StudentsOneToManyUni>();
		list1.add(s1);
		list1.add(s4);

		List<StudentsOneToManyUni> list2 = new ArrayList<StudentsOneToManyUni>();
		list2.add(s2);
		list2.add(s3);
		
		SubjectsOneToManyUni c1 = new SubjectsOneToManyUni(101, "Java", list1);
		SubjectsOneToManyUni c2 = new SubjectsOneToManyUni(201, "PHP", list2);
		
		session.save(c1);
		session.save(c2);
		
		tran.commit();
		session.close();

	}
}