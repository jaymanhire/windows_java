package com.lists;

import java.util.ArrayList;
import java.util.LinkedList;

public class Application {

	public static void main(String[] args) {

		ArrayList<Integer> words = new ArrayList<>();
		// words.add("hello");
		// words.add("there");
		words.add(56);
		words.add(987);

		int item1 = words.get(0);
		int item2 = words.get(1);

		/*
		 * System.out.println(item1 + item2); System.out.println(item2);
		 */

		LinkedList<Integer> numbers = new LinkedList<Integer>();
		numbers.add((int)3.987);
		numbers.add(4);
		numbers.add(98);
		numbers.add(108);
		numbers.remove(2);

		// System.out.println(numbers.get(0));

		System.out.println();

		for (int nums : numbers) {
			System.out.print(nums + "\t");

		}

	}

}
