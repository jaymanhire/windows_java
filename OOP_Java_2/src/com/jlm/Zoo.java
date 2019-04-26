package com.jlm;

public class Zoo {
	
	public static void main(String[] args) {
		
		Animal animal1 = new Animal(5, "male", 102);
		animal1.eat();
		
		Bird bird1 = new Bird(3, "female", 10);
		bird1.fly();
		
		//System.out.print("Bird ");
		
		bird1.eat();
		System.out.println();
		bird1.speak();
		
		System.out.println();
		
		Fish fish1 = new Fish(14, "Male", 455);
		fish1.speak();
		
		System.out.println();
		
		Dog dog1 = new Dog(4, "Female", 49);
		dog1.speak();
		
		
		
	}

}
