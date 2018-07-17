package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		/*ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
		objA.setMessage("I'm Object A");
		objA.getMessage();
		HelloWorld objB = (HelloWorld)context.getBean("helloWorld");
		objB.getMessage();*/
		/*AbstractApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		HelloWorld obj = (HelloWorld)context.getBean("helloWorld");
		obj.getMessage();
		context.registerShutdownHook();beanÉúÃüÖÜÆÚ
		*/
		
		/*ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		 HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
          
	      objA.getMessage1();
	      objA.getMessage2();

	      HelloIndia objB = (HelloIndia) context.getBean("helloIndia");
	      objB.getMessage1();
	      objB.getMessage2();
	      objB.getMessage3();
	      bean¼Ì³Ð*/
		
		ApplicationContext context =new ClassPathXmlApplicationContext("Bean2.xml");
		TextEditor te =(TextEditor)context.getBean("textEditor");
		te.spellCheck();
		te.getName();
		
		/*ApplicationContext context  = new ClassPathXmlApplicationContext("Bean3.xml");
		JavaCollection jc = (JavaCollection)context.getBean("javaCollection");
		jc.getAddressList();
		jc.getAddressMap();
		jc.getAddressProp();
		jc.getAddressSet();*/
	}
}
