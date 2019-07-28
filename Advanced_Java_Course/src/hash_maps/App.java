package hash_maps;

import java.util.HashMap;

public class App {

	public static void main(String[] args) {

		HashMap<String, Integer> phonebook = new HashMap<>();
		// they are unordered
		// they do not allow duplicate keys

		phonebook.put("Kevin", 12345);
		phonebook.put("Jill", 97456);
		phonebook.put("Brenda", 55469);
		phonebook.put("Brenda", 12345); // overwrites previous entry for Brenda
		phonebook.put(null, 000);

		if (phonebook.containsKey("Brenda")) {
			phonebook.remove("Brenda");
		}

		phonebook.replace("Kevin", 12345, 99);

		System.out.println(phonebook);
		phonebook.clear();
		System.out.println(phonebook);

	}

}
