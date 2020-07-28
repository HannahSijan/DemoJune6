package com.edureka.beans.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.edureka.beans.Car;
import com.edureka.beans.Person;
import com.edureka.beans.Student;

public class TestAnnot {
	
public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("core.xml");
		Person obj =(Person) context.getBean("person");
		
		System.out.println("person " +obj.getName()+" has a car with price "+obj.getCar().getPrice()+" of model "+obj.getCar().getModel());
}
}
