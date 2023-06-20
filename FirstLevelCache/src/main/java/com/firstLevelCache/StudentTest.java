package com.firstLevelCache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentTest {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Configuration configuration =new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session =sessionFactory.openSession();
		Transaction transaction =session.beginTransaction();
		
		Student student=(Student) session.get(Student.class, 1);
		System.out.println("Id>>" +student.getId());
		System.out.println("FirstName>>" +student.getFname());
		System.out.println("LastName>>" +student.getLname());
		System.out.println("City>>" +student.getCity());
		System.out.println("Email>>" +student.getEmail());
		System.out.println("Mobile>>" +student.getMobile());
		
		
		Student student1=(Student) session.get(Student.class, 1);
		System.out.println("Id>>" +student1.getId());
		System.out.println("FirstName>>" +student1.getFname());
		System.out.println("LastName>>" +student1.getLname());
		System.out.println("City>>" +student1.getCity());
		System.out.println("Email>>" +student1.getEmail());
		System.out.println("Mobile>>" +student1.getMobile());
		
		
        session.close();
        transaction.commit();
        sessionFactory.close();
        
        System.out.println("Student data retrieve successfully");

	}

}
