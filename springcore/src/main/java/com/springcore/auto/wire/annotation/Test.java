package com.springcore.auto.wire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.auto.wire.Emp;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context =new ClassPathXmlApplicationContext("com/springcore/auto/wire/annotation/config.xml");
		Emp emp1 = context.getBean("emp1", Emp.class);
		System.out.println(emp1);
	}

}
