package com.updateOperation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
public static void main(String[] args) {
	Configuration conf=new Configuration();
	conf.configure("hibernate.cfg.xml");
	@SuppressWarnings("deprecation")
	SessionFactory sessionFactory =conf.buildSessionFactory();
	Session session=sessionFactory.openSession();
	Transaction tra=session.beginTransaction();
	Student m=(Student)session.get(Student.class,1);
	m.setCity("pune");
	session.save(m);
	tra.commit();
	session.close();
	sessionFactory.close();
	System.out.println("update  record successfully");	

	//System.out.println("update record successfully");	
}
}
