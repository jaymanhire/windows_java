package com.jlm.classes;

public class Dog {

	private static String description;
	private String name;
	private int age;
	private int weight;
	private String breed;
	private static int objectCount = 0;

	public int id;

	public Dog() {
		id = getObjectCount();
		setObjectCount(getObjectCount() + 1);
	}

	public void showName() {
		System.out.println("Object ID: " + id + description + ", " + name);
	}

	public static void showInfo() {
		System.out.println(description);
	}

	public Dog(String name, int age, int weight, String breed) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.breed = breed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	@Override
	public String toString() {
		return "Dog ID: " + id + " [name=" + name + ", age=" + age + ", weight=" + weight + ", breed=" + breed + "]";
	}

	public static int getObjectCount() {
		return objectCount;
	}

	public static void setObjectCount(int objectCount) {
		Dog.objectCount = objectCount;
	}

}
