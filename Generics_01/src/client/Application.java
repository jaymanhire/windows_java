package client;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application {

	public static void main(String[] args) {

		Container<Integer, String> container = new Container<>(12, "Hello");
		int val1 = container.getItem1();
		String val2 = container.getItem2();

		container.printItems();

		Set<String> mySet1 = new HashSet<String>();
		mySet1.add("first");
		mySet1.add("second");
		mySet1.add("third");

		Set<String> mySet2 = new HashSet<String>();
		mySet2.add("first");
		mySet2.add("second");
		mySet2.add("computer");

		Set<String> resultSet = union(mySet1, mySet2);

		Iterator<String> itr = resultSet.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

	public static <E, V, Jay> Set<E> union(Set<E> set1, Set<E> set2) {
		Set<E> result = new HashSet<E>(set1);
		result.addAll(set2);
		return result;
	}

}
