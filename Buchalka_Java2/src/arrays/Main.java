package arrays;

public class Main {

	public static void main(String[] args) {

		int[] myIntArray = new int[25];
		
		printArray(myIntArray);

		for (int i = 0; i < 10; i++) {
			myIntArray[i] = i += 2;
			System.out.println(i);
		}

	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = i * 10;
			System.out.println("Element " + i + ": " + array[i]);
		}
	}
}
