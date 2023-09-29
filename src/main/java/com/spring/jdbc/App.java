package com.spring.jdbc;

import java.util.Iterator;
import java.util.List;
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

//		**INSERT Student**

		Student student = new Student();

		student.setId(103);
		student.setName("John Doe");
		student.setCity("Cape Town");

		int result = studentDao.insert(student);

		System.out.println("Number of student inserted : " + result);

//		 **UPDATE Student** 
		/*
		 * Student student = new Student();
		 * 
		 * student.setId(102); student.setName("Manish"); student.setCity("Vasad");
		 * 
		 * int result = studentDao.change(student);
		 * 
		 * System.out.println("Number of student updated : " + result);
		 */

//		** DELETE Student** 
		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.print("Enter user id for delete record : "); int a = sc.nextInt();
		 * 
		 * int result = studentDao.delete(a);
		 * 
		 * System.out.println("Number of student deleted : " + result);
		 */

//		**Select Student** 
		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.print("Enter user id for select record : "); int a = sc.nextInt();
		 * 
		 * Student result = studentDao.getStudent(a);
		 * 
		 * System.out.println("Student data : " + result);
		 */

		// **Select all Student**
		List<Student> results = studentDao.getAllStudents();

		System.out.println("All student data : ");
		for (Student list : results) {
			System.out.println(list);
		}

	}
}
