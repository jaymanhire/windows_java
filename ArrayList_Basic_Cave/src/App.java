import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<Integer>();

		numbers.add(10);
		numbers.add(100);
		numbers.add(40);

		// Retrieving
		System.out.println(numbers.get(1));

		System.out.println("Iteration #1: ");
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		// Removing items(careful!) from the end is fast
		numbers.remove(numbers.size() - 1);

		System.out.println("\nIteration #2: ");
		for (Integer values : numbers) {
			System.out.println(values);
		}
		List<String> values = new ArrayList<>();
		
		

	}

}
