package com.deleteOperation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		Configuration conf=new Configuration();
		conf.configure("hibernate.cfg.xml");
		@SuppressWarnings("deprecation")
		SessionFactory sessionFactory=conf.buildSessionFactory();
		Session session=sessionFactory.openSession();
	               Transaction transaction=session.beginTransaction();
         Student s=(Student)session.get(Student.class,2);
         session.delete(s);
         transaction.commit();
         session.close();
         sessionFactory.close();
         System.out.println("delete record successfully");
        
         
         
	}

}
