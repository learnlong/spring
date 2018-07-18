package com.tutorialspoint3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		/*ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		
		HelloWorld helloWorld = context.getBean(HelloWorld.class);
		
		helloWorld.setMessage("Hello World");
		helloWorld.getMessage();*/
		
		/*ApplicationContext context = new AnnotationConfigApplicationContext(TextEditorConfig.class);
		
		TextEditor textEditor = context.getBean(TextEditor.class);
		
		textEditor.spellCheck();*/
		
		/*ConfigurableApplicationContext  context = new ClassPathXmlApplicationContext("Bean6.xml");
		
		context.start();
		
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		
		obj.getMessage();
		
		context.stop();*/
		/*ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Bean6.xml");
		
		CustomEventPublisher cvPublisher = (CustomEventPublisher)context.getBean("customEventPublisher");
		
		cvPublisher.publish();
		cvPublisher.publish2();*/
		
		/*ApplicationContext context = new ClassPathXmlApplicationContext("Bean7.xml");
		
		Student student = (Student) context.getBean("student");
		
		student.getName();
		student.getAge();
		student.printThrowException();*/
		
        ApplicationContext context = new ClassPathXmlApplicationContext("Bean8.xml");
		
		Student student = (Student) context.getBean("student");
		
		student.getName();
		student.getAge();
		student.printThrowException();
		
	}
}
