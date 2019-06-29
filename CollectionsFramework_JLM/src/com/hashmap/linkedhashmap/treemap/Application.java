package com.hashmap.linkedhashmap.treemap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Application {

	public static void main(String[] args) {

		// LinkedHashMap will preserves order of insertion - no duplicates!
		// TreeMap - natural order(alphabetical) - no duplicates!
		/*
		 * If using a custom type(s) and desire a particular ordering: Use the
		 * Comparable Interface and use the compareTo() method
		 */

		LinkedHashMap<String, String> dictionary = new LinkedHashMap<>();
		dictionary.put("Brave", "having courage, ready to face danger.");
		dictionary.put("Brilliant", "exceptionally clever.");
		dictionary.put("Joy", "a feeling of happiness.");
		dictionary.put("Confidence", "belief in oneself");
		dictionary.put("Brilliant", "xxxxxxxxxxxxxxxxxxxxxxx.");

		for (String word : dictionary.keySet()) {
			System.out.print(word + ": ");
			System.out.println(dictionary.get(word));
		}
		System.out.println();

		for (Map.Entry<String, String> entry : dictionary.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());

		}

	}

}
