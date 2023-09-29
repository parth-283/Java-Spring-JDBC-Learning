package com.spring.jdbc;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entites.Student;

public class App {
	public static void main(String[] args) {
		System.out.println("JDBC project running......");
		/* Spring JDBC=> jdbcTemplate */
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");

		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

		/*
		 * **INSERT DATA**
		 * 
		 * Student student = new Student();
		 * 
		 * student.setId(103); student.setName("Piyush"); student.setCity("Mumbai");
		 * 
		 * int result = studentDao.insert(student);
		 * 
		 * System.out.println("Number of record inserted : " + result);
		 */

		/*
		 * **UPDATE DATA** Student student = new Student();
		 * 
		 * student.setId(102); student.setName("Manish"); student.setCity("Vasad");
		 * 
		 * int result = studentDao.change(student);
		 * 
		 * System.out.println("Number of record updated : " + result);
		 */

		/*
		 * ** DELETE DATA** Scanner sc = new Scanner(System.in);
		 * System.out.print("Enter user id for delete record : "); int a = sc.nextInt();
		 * 
		 * int result = studentDao.delete(a);
		 * 
		 * System.out.println("Number of record deleted : " + result);
		 */

		// **Select DATA**
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter user id for select record : ");
		int a = sc.nextInt();

		Student result = studentDao.getStudent(a);

		System.out.println("Number of record deleted : " + result);

	}
}
