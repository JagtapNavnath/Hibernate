package com.insertOperation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		
		Configuration conf=new Configuration();
		conf.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory=conf.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		Student s=new Student();
		s.setUname("Navnath");
		s.setCity("Gangewadi");
		s.setContact("1234670");
		session.save(s);
		transaction.commit();
		session.close();
		System.out.println("data insert data successfully");
		

	}

}
