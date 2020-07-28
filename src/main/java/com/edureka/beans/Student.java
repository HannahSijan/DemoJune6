package com.edureka.beans;

import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	
	
	
	String name;
	String place;
	
	
	
	Hostel hostel;
	
	public Student(String name, String place, Hostel hostel) {
		super();
		this.name = name;
		this.place = place;
		this.hostel = hostel;
	}
	public Hostel getHostel() {
		return hostel;
	}
	public void setHostel(Hostel hostel) {
		this.hostel = hostel;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	

}
