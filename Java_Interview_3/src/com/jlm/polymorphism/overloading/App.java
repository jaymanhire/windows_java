package com.jlm.polymorphism.overloading;

public class App {

	public static void main(String[] args) {
		
		Operation op = new Operation();
		
		System.out.println(op.add(6, 687));
		
		System.out.println(op.add(87, 987, 65));
		
		System.out.println(op.add(87, 987, 65, 675));

	}

}
