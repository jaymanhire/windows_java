package digitsum_challenge;

public class App {

	public static void main(String[] args) {

		System.out.println("The sum of the digits in 125: " + sumDigits(125));
		// System.out.println("The sum of the digits in 987 " +sumDigits(987));
		// System.out.println("The sum of the digits in 1659 " +sumDigits(1659));

	}

	private static int sumDigits(int n) {
		if (n < 10) {
			return -1;
		}

		int sum = 0;

		// 125 -> 125/10 = 12 -> 12 * 10 = 120 -> 125 - 120 = 5
		while (n > 0) {
			// extract least significant digit
			int digit = n % 10;
			System.out.println("digit: " + digit);
			sum += digit;
			System.out.println("sum: " + sum);
			// drop least significant digit
			n /= 10; // same as n = n /10;
		}
		return sum;

	}

}
