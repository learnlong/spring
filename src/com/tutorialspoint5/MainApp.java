package com.tutorialspoint5;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[]args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("produceBean.xml");
		StudentJDBCTemplate studentJDBCTemplate = 
				(StudentJDBCTemplate)context.getBean("studentJDBCTemplate");
		System.out.println("-----start------");
		studentJDBCTemplate.create("zhangsan", 20);
		studentJDBCTemplate.create("lisi", 22);
		studentJDBCTemplate.create("wangwu", 30);
		System.out.println("----Listing Multiple Records");
		List<Student> students = studentJDBCTemplate.listStudents();
		for(Student record : students) {
			System.out.println("ID : "+record.getId());
			System.out.println(",Name : "+record.getName());
			System.out.println(",Age : "+record.getAge());
		}
		
		System.out.println("Listing Record with Id 2---");
		Student student = studentJDBCTemplate.getStudent(4);
		System.out.println("ID :"+student.getId());
		System.out.println("Name :"+student.getName());
		System.out.println("Age :"+student.getAge());
	}
}
