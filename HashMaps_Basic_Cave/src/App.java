import java.util.HashMap;
import java.util.Map;

public class App {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<>(); // Strings keyed by Integers

		map.put(5, "Five");
		map.put(8, "Eight");
		map.put(6, "Six");
		map.put(4, "Four");
		map.put(2, "Two");

		map.put(6, "Hello");

		String text = map.get(6);
		System.out.println(text);

		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry);
		}
		System.out.println();

		for (Map.Entry<Integer, String> entry_2 : map.entrySet()) {
			int key = entry_2.getKey();
			String value = entry_2.getValue();

			System.out.println(key + ": " + value);
		}

	}

}
