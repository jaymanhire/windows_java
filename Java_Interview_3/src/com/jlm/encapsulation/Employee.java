package com.jlm.encapsulation;

public class Employee {

	private String name;
	private int age;
	private int id;

	public Employee(String name, int age, int id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getId() {
		return id;
	}

}
