package com.entiry;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class One2OneMain {

	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetails.class).buildSessionFactory();

		Session s = sf.getCurrentSession();
		try {
			
			Instructor i = new Instructor("Aaaa","Aaa llll","aaaa@aaa.com");
			InstructorDetails id = new InstructorDetails("you tuble", "watching");
			i.setInstructorDetails(id);
			s.beginTransaction();
			s.save(i);
			s.getTransaction().commit();
		} finally {
			sf.close();
		}

	}

}
