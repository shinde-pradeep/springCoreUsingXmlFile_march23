package com.coreSpringXml.SetterBasedDi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {

	public static void main(String[] args) {
		
		
	ApplicationContext ac = new ClassPathXmlApplicationContext("com/coreSpringXml/SetterBasedDi/studentConfig.xml");
	
//	System.out.println(ac);

    Student st1 = ac.getBean("student1",Student.class);
    Student st2 = ac.getBean("student2",Student.class);

		System.out.println(st1);
		
		System.out.println(st2);

		
	}
	
}
