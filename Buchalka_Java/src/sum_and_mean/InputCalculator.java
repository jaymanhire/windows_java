package sum_and_mean;

import java.util.Scanner;

public class InputCalculator {

	public static void main(String[] args) {

		inputThenPrintSumAndAverage();

	}

	public static void inputThenPrintSumAndAverage() {

		Scanner scan = new Scanner(System.in);

		int count = 0;
		int sum = 0;

		//System.out.print("Enter a number: ");

		while (true) {

			boolean isAnInt = scan.hasNextInt();

			if (isAnInt) {
				int number = scan.nextInt();
				sum += number;
				count++;

			} else {
				break;
			}
			scan.nextLine();

		}

		System.out.println("SUM = " + sum + " AVG = " + Math.ceil( sum / count));
		scan.close();
	}

}
