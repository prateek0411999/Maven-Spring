package com.springcore.constructorinjection;

public class Person {

	private String name;
	private int personid;
	
	//using the constructor injection
	public Person(String name, int id)
	{
		this.name=name;
		this.personid=id;
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name+ " : "+ this.personid;
	}
	
	
}
