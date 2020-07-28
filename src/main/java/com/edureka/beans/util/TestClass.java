package com.edureka.beans.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.edureka.beans.Student;

public class TestClass {

	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		Student obj =(Student) context.getBean("student");
		System.out.println("Student " +obj.getName()+" lives in "+obj.getHostel().getHname());
		
		
		
	}

}
