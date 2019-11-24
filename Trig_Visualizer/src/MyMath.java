import java.util.Scanner;

public class MyMath {

	String input;
	float a;
	float b;
	float c;

	// Error: the hypotenuse is always the longest side of a right triangle!

	// while (input != "a" || input != "b" || input != "c");

	Scanner sideSelection = new Scanner(System.in);
	Scanner sel2 = new Scanner(System.in);

	void takeInputs() {

		System.out.println("For which side would you like to solve?\nEnter 'a','b', or 'c'(hypotenuse) ");
		input = sideSelection.next();

	}

	void processInputs() {

		System.out.println("OK, let's solve for side " + input);

		switch (input) {
		case "a":
			System.out.println("Enter side b: ");
			b = sel2.nextFloat();
			System.out.println("Enter side c: ");
			c = sel2.nextFloat();
			break;
		case "b":
			System.out.println("Enter side a: ");
			a = sel2.nextFloat();
			System.out.println("Enter side c: ");
			c = sel2.nextFloat();
			break;
		case "c":
			System.out.println("Enter side a: ");
			a = sel2.nextFloat();
			System.out.println("Enter side b: ");
			b = sel2.nextFloat();
			break;
		default:
			System.out.println("Please enter a valid choice.");
		}

	}

	void selectFunction() {

		switch (input) {
		case "a":
			pythagorean_a();
			break;
		case "b":
			pythagorean_b();
			break;
		default: // "c"
			pythagorean_hyp();
			break;
		}
	}

	void pythagorean_a() {
		double sum = Math.pow(c, 2) - Math.pow(b, 2);
		double sideA = Math.sqrt(sum);
		System.out.format("Side A = %.3f", sideA);
	}

	void pythagorean_b() {
		double sum = Math.pow(c, 2) - Math.pow(a, 2);
		double sideB = Math.sqrt(sum);
		System.out.format("Side B = %.3f", sideB);
		
	}

	void pythagorean_hyp() {
		double sum = Math.pow(a, 2) + Math.pow(b, 2);
		double hypotenuse = Math.sqrt(sum);
		System.out.format("Side C (hypotenuse) = %.3f", hypotenuse);

	}
}
