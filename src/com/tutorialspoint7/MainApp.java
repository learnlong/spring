package com.tutorialspoint7;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = 
             new ClassPathXmlApplicationContext("transcationBean2.xml");
      StudentDAO studentJDBCTemplate = 
      (StudentDAO)context.getBean("studentJDBCTemplate");     
      System.out.println("------Records creation--------" );
      studentJDBCTemplate.create("Zara", 11, 98, 2010);
      studentJDBCTemplate.create("Nuha", 20, 95, 2010);
      studentJDBCTemplate.create("Ayan", 25, 102, 2011);
      System.out.println("------Listing all the records--------" );
      List<StudentMarks> studentMarks = studentJDBCTemplate.listStudents();
      for (StudentMarks record : studentMarks) {
         System.out.print("ID : " + record.getId() );
         System.out.print(", Name : " + record.getName() );
         System.out.print(", Marks : " + record.getMarks());
         System.out.print(", Year : " + record.getYear());
         System.out.println(", Age : " + record.getAge());
      }
   }
}
