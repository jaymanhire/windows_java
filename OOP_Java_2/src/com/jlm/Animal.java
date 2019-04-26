package com.jlm;

public class Animal {

	int age;
	String gender;
	int weightInLbs;

	public Animal(int age, String gender, int weightInLbs) {
		super();
		this.age = age;
		this.gender = gender;
		this.weightInLbs = weightInLbs;
	}

	public void speak() {
		System.out.println(getClass().getSimpleName());
		System.out.println("I am " + age + " years old.");
		System.out.println("Gender: " + gender);
		System.out.println("Weight: " + weightInLbs + " lbs.");
	}

	public void eat() {
		System.out.println("Eating...");
	}

	public void sleep() {
		System.out.println("Sleeping...");
	}

}
