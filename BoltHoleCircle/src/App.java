import java.util.Scanner;

public class App {

	private static int count = 1;

	private static final int circle = 360;	

	public static void main(String[] args) {

		System.out.println("Enter the Diameter of the Hole Circle: ");
		float diameter = 0;
		Scanner inputDiameter = new Scanner(System.in);
		diameter = inputDiameter.nextFloat();

		System.out.println("Enter the Number of Holes in the Circle: ");
		int numberOfHoles;
		Scanner numHoles = new Scanner(System.in);
		numberOfHoles = numHoles.nextInt();
		
		double holeDegrees = circle / numberOfHoles;

		// convert degrees to radians
		double radians = Math.toRadians(holeDegrees);
		// convert radians to degrees

		float radius = diameter / 2;

		int[] holeSpreadArray = new int[circle + 1];

		double step = holeDegrees;

		// then populate holeSpreadDegrees with the values
		for (int i = (int) step; i <= 360; i += step) {
			holeSpreadArray[i] = i;
			System.out.println("Hole #" + count + ": " + holeSpreadArray[i] + " degrees.");
			count++;
		}
		
		System.out.println("\n\tHole Locations");
		System.out.println("\t**************");

		count = 1;

		for (int i = (int) step; i <= 360; i += step) {
			holeSpreadArray[i] = i;
			while (radians < 6.3) {
				double x = Math.sin(radians) * radius;
				double y = Math.cos(radians) * radius;
				System.out.printf("Hole #%d X: %.4f  Y: %.4f\n", count, x, y);
				radians += Math.toRadians(holeDegrees);
				count++;			
			}
		}

		inputDiameter.close();
		numHoles.close();

	}
}