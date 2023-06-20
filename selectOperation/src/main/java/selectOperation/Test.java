package selectOperation;




import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

		public class Test {
		@SuppressWarnings("unchecked")
		public static void main(String[] args) {		
		Configuration conf=new Configuration();
		conf.configure("hibernate.cfg.xml");
		@SuppressWarnings("deprecation")
		SessionFactory sessionFactory=conf.buildSessionFactory();
		Session session =sessionFactory.openSession();
		
//		first level chache
//		Student m=(Student) session.get(Student.class,1);
//		System.out.println("student 1 data");
//		System.out.println(m.getUname());
//		System.out.println(m.getCity());
//		System.out.println(m.getContact()); 
//		
//		Student m1=(Student) session.get(Student.class,1);
//		System.out.println("student 2 data");
//		System.out.println(m.getUname());
//		System.out.println(m.getCity());
//		System.out.println(m.getContact()); 
//		
		
		System.out.println("first query");
		System.out.println("--------------------------------------------------");
		
		Query query=session.createQuery("from Student");
		query.setCacheable(true);
		List <Student> students=query.list();
		for(Student student:students) {
			
			System.out.println("firstname>>" + student.getUname());
			System.out.println("city>>" + student.getCity());
			System.out.println("contact>>" + student.getContact());
			
	     //session.close();
	     sessionFactory.close();
	     System.out.println("Retrieve data successfully");
	}
	
	}	
				
}
		
