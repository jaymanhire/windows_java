
public class App {

	public static void main(String[] args) {

		int[] myArray1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int[] myArray2 = { 2, 4, 18, 2, 4, 55, 65, 98, 102, 87, 777 };

		System.out.print("Number of elements in common between arrays: ");
		System.out.println(countDuplicates(myArray1, myArray2));

	}

	public static int countDuplicates(int[] items1, int[] items2) {
		int count = 0;
		for (int i = 0; i < items1.length; i++) {
			for (int j = 0; j < items2.length; j++) {
				if (items1[i] == items2[j]) {
					count++;
				}
			}
		}
		return count;
	}

}
