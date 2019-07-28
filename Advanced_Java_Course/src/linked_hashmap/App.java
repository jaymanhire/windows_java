package linked_hashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class App {
	public static void main(String[] args) {

		LinkedHashMap<String, Integer> phonebook = new LinkedHashMap<>(4, 0.75f, false);
		// true uses access order instead, and puts most recently accessed at the bottom
		// When they were added, or when they were modified ordering

		phonebook.put("Kevin", 12345);
		phonebook.put("Jill", 97456);
		phonebook.put("Brenda", 55469);
		phonebook.put("Gary", 22222);

		System.out.println("Jill's number: " + phonebook.get("Jill"));

		System.out.println("\nList of contacts in phonebook: ");
		for (Map.Entry<String, Integer> entry : phonebook.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

	}
}