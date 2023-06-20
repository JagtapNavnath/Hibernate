package com.queryLevelCache;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentTest {

	@SuppressWarnings({ "deprecation", "unused", "unchecked" })
	public static void main(String[] args) {
		Configuration configuration =new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session =sessionFactory.openSession();
		Transaction transaction =session.beginTransaction();

		Query query=session.createQuery("from Student");
		query.setCacheable(true);
		List <Student> students=query.list();
		for(Student student:students) {
			System.out.println("Id>>" + student.getId());
			System.out.println("firstname>>" + student.getFname());
			System.out.println("lastname>>" + student.getLname());
			System.out.println("city>>" + student.getCity());
			System.out.println("email>>" + student.getEmail());
			System.out.println("Mobile>>" + student.getMobile());
			sessionFactory.close();
		    System.out.println("Retrieve data successfully");
	}
  }
}