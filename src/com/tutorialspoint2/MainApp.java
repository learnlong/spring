package com.tutorialspoint2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		/*ApplicationContext context = new ClassPathXmlApplicationContext("Bean4.xml");
		Student student = (Student)context.getBean("student");
		System.out.println("Name "+ student.getName());
		System.out.println("Age "+ student.getAge());*/
		/*ApplicationContext context = new ClassPathXmlApplicationContext("Bean4.xml");
		TextEditor te = (TextEditor)context.getBean("textEditor");
		te.spellCheck();*/
		
//		ApplicationContext context   = new ClassPathXmlApplicationContext("Bean5.xml");
//		Profile profile = (Profile)context.getBean("profile");
//		profile.printAge();
//		profile.printName();
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Bean4.xml");
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.getMessage();
		context.registerShutdownHook();
	}
}
