package com.practice.MappingTables;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.net.ssl.ExtendedSSLSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import javassist.bytecode.stackmap.BasicBlock.Catch;


/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args ) 
	{
		Laptop lappy=new Laptop();
		lappy.setLid(102);
		lappy.setLname("DELL");
		
		
		Student std=new Student();
		std.setMarks(50);
		std.setName("Bagchandani");
		std.setRollno(2);
		std.getLaptop().add(lappy);
		
		
		lappy.getStudent().add(std);
		
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class).buildSessionFactory();
				Session session =sessionFactory.openSession();
		try {
			Transaction tx=session.beginTransaction(); 
			//hib=(Student)session.get(Student.class,101);//getting data from database
			session.save(lappy);//to save data into db
			session.save(std);
			tx.commit();
			
		}
		catch(Exception e){
			e.printStackTrace();   
		}

		session.close();
	}
}