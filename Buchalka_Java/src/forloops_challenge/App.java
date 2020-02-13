package forloops_challenge;

public class App {

	public static void main(String[] jays) {

		System.out.println("$10,000 at 8% interest: " + calculateInterest(10000, 2.0));
		System.out.println("$10,000 at 7% interest: " + calculateInterest(10000, 3.0));
		System.out.println("$10,000 at 6% interest: " + calculateInterest(10000, 4.0));
		System.out.println("$10,000 at 5% interest: " + calculateInterest(10000, 5.0));

		for (int i = 0; i < 5; i++) {
			System.out.println("Loop " + i + ": " + String.format("%.2f", calculateInterest(10000.0, i)));
		}

		System.out.println();

		for (int i = 2; i < 9; i++) {
			System.out
					.println("$10,000 at " + i + "% interest " + String.format("%.2f", calculateInterest(10000.0, i)));
		}

		System.out.println("\n****************** Prime Method *****************");
		int count = 0;
		for (int i = 10; i < 50; i++) {
			if (isPrime(i)) {
				count++;
				System.out.println(i + " is prime? " + isPrime(i));
				if (count == 10) {
					System.out.println("Exiting...");
					break;
				}
			}

		}
	}

	public static boolean isPrime(int n) {
		if (n == 1) {
			return false;
		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static double calculateInterest(double amount, double interestRate) {
		return amount * (interestRate / 100);
	}

}
