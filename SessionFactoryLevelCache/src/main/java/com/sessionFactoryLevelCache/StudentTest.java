package com.sessionFactoryLevelCache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StudentTest {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Configuration configuration =new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session =sessionFactory.openSession();
		Student student1=(Student) session.get(Student.class, 1);
		System.out.println("Id>>" + student1.getId());
		System.out.println("firstname>>" + student1.getFname());
		System.out.println("lastname>>" + student1.getLname());
		System.out.println("city>>" + student1.getCity());
		System.out.println("email>>" + student1.getEmail());
		System.out.println("Mobile>>" + student1.getMobile());
		
		System.out.println("Second Level Cache");
		
		Session session1 =sessionFactory.openSession();
		Student student2=(Student) session1.get(Student.class, 2);
		System.out.println("Id>>" + student2.getId());
		System.out.println("firstname>>" + student2.getFname());
		System.out.println("lastname>>" + student2.getLname());
		System.out.println("city>>" + student2.getCity());
		System.out.println("email>>" + student2.getEmail());
		System.out.println("Mobile>>" + student2.getMobile());
        
}
}
