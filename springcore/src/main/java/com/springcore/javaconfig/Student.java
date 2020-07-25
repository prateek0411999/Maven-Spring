package com.springcore.javaconfig;

import org.springframework.stereotype.Component;

//ese name bhi de skte bean k liye nhi toh vhi firstletter lowercase krne wala seen toh hh hi
@Component("firststudent")
public class Student {
	
	private Samosa samosa;
	
	
	
	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}



	public Samosa getSamosa() {
		return samosa;
	}



	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}



	public void study() {
		System.out.println("Student is reading book");
		this.samosa.display();
	}

}
