package com.collections.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Application2 {

	public static void main(String[] args) {

		// ArrayList allows duplicates!
		HashSet<Employee> hashSet = new HashSet<Employee>();
		hashSet.add(new Employee("Mike", 3500, "Accounting"));
		hashSet.add(new Employee("Paul", 3000, "Admin"));
		hashSet.add(new Employee("Peter", 4000, "IT"));
		hashSet.add(new Employee("Angel", 2000, "Maint"));

		ArrayList<Employee> myList = new ArrayList<Employee>(hashSet);
		// Here is the sort by salary(implemented in the comparTo method in the Employee class)
		Collections.sort(myList);
		
		printOut(myList);
		
		System.out.println();

	}

	public static void printOut(ArrayList<Employee> myList) {
		for (Employee emp : myList) {
			System.out.println(emp);
		}
	}

	// System.out.println(myList.toString());

}
