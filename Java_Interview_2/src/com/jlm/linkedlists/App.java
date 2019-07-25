package com.jlm.linkedlists;

import java.util.LinkedList;

public class App {

	public static void main(String[] args) {
		
		//LinkedLists can grow and shrink dynamically at runtime
		
		LinkedList<String> students = new LinkedList<String>();
		
		students.add("Charlie");
		students.add("Sally");
		students.add("Morgan");
		students.add("Taylor");
		students.add("Jamie");
		
		students.addFirst("Sarah");
		students.addLast("Hailey");
		students.add(2, "Tara");
		
		String firstStudent = students.getFirst();
		System.out.println("First student: " + firstStudent);
		String lastStudent = students.getLast();
		System.out.println("Last student: " + lastStudent);
		System.out.println(students.size());

		System.out.println(students);
		
		String secondStudent = students.get(1);
		System.out.println("Second " + secondStudent);
		
		int i = students.indexOf("Morgan");
		System.out.println("index of 'Morgan': " + i );
		
		students.removeFirst();
		students.removeLast();
		students.remove("Jamie");
		students.remove(1); // of the new number 1
		System.out.println(students);
		
		boolean hasTaylor = students.contains("Taylor");
		System.out.println("Contains Taylor? " + hasTaylor);
		
		students.clear();
		System.out.println(students);
		

	}

}
