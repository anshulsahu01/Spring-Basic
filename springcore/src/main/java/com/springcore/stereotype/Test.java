package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	ApplicationContext con= new ClassPathXmlApplicationContext("com/springcore/stereotype/config.xlm");
	
	Student student =con.getBean("student" ,Student.class);
	System.out.println(student);
}
