import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		int step = 72;

		int numberOfHoles = 0;
		int i = 0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of elements you want in array:");
		numberOfHoles = s.nextInt();
		int a[] = new int[numberOfHoles];

		System.out.println("Enter all the elements: ");
		for (i = 0; i < numberOfHoles; i++) {
			a[i] = s.nextInt();
			a[i] += step;
		}
		System.out.print("Elements of array after increment by 72: ");
		for (i = 0; i < numberOfHoles - 1; i++) {
			System.out.print(a[i] + ",");
		}
		System.out.print(a[numberOfHoles - 1]);

		s.close();
	}

}
