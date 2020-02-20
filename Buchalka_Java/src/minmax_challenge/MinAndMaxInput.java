package minmax_challenge;

import java.util.Scanner;

public class MinAndMaxInput {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int min = 2147483647;
		int max = -2147483648;

		while (true) {
			System.out.print("Enter Number: ");
			boolean isAnInt = input.hasNextInt();

			if (isAnInt) {

				int number = input.nextInt();

				if (number > max) {
					max = number;
				}
				if (number < min) {
					min = number;
				}
			} else {
				break;
			}
			input.nextLine();
		}
		input.close();

		System.out.println("Min: " + min + " Max: " + max);

	}

}
