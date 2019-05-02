import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {

	public static void main(String[] args) {

		List<Integer> arrayList = new ArrayList<Integer>();
		LinkedList<Integer> linkedList = new LinkedList<Integer>();

		doTimings("ArrayList", arrayList);
		doTimings("LinkedList", linkedList);

	}

	private static void doTimings(String type, List<Integer> list) {
		/*
		 * ArrayLists manage arrays internally.*/

		/*for (int i = 0; i < 1E5; i++) {
			list.add(i);
		}*/

		long start = System.currentTimeMillis();

		/*
		 * // Add items at end of list for(int i = 0; i < 1E5; i++) { list.add(i); }
		 */
		// Add items elsewhere in the list
		
		for (int i = 0; i < 1E5; i++) {
			list.add(0, i);
		}
		

		for (int i = 0; i < 1E5; i++) {
			// Add starting at index 1000
			list.add(list.size() - 1000, i);
		}

		long end = System.currentTimeMillis();

		System.out.println("Time taken: " + (end - start) + " ms for " + type);
	}

}
