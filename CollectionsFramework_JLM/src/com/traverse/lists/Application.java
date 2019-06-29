package com.traverse.lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Application {

	public static void main(String[] args) {

		List<String> animals = new ArrayList<String>();
		animals.add("Lion");
		animals.add("Cat");
		animals.add("Dog");
		animals.add("Bird");
		/*
		 * // System.out.println(animals);
		 * 
		 * for (int i = 0; i < animals.size(); i++) {
		 * System.out.println(animals.get(i)); }
		 * 
		 * System.out.println(); for (String str : animals) { System.out.println(str); }
		 */

		List<Vehicle> vehicles = new LinkedList<Vehicle>(); // default size 10
		Vehicle vehicle2 = new Vehicle("Toyota", "Camry", 9000, false);

		vehicles.add(new Vehicle("Chevy", "Malibu", 15000, false));
		vehicles.add(vehicle2);
		vehicles.add(new Vehicle("Jeep", "Wrangler", 25000, true));

		/*for (Vehicle car : vehicles) {
			System.out.println(car.toString());
		}*/
		
		printElements(vehicles);
		printElements(animals);
	}

	public static void printElements(List someList) {
		for (int i = 0; i < someList.size(); i++) {
			System.out.println(someList.get(i));
			//someList.remove(1);
		}
	}
}
