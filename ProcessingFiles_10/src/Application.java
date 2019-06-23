import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		MyFileUtils u = new MyFileUtils();
		try {
			System.out.println(u.subtract10FromLargrNumber(30));
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		/*
		 * Scanner input = new Scanner(System.in);
		 * 
		 * for (int i = 0; i < 4; i++) {
		 * 
		 * System.out.println("Enter some text: "); String enteredText =
		 * input.nextLine(); System.out.println("You typed: " + enteredText);
		 * 
		 * } input.close();
		 */

		File file = new File("myFile.txt");
		try {

			Scanner input;
			input = new Scanner(file);

			while (input.hasNextLine()) {
				String line = input.nextLine();
				System.out.println(line);
			}
			input.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not Found: " + file);
			System.out.println();
			e.printStackTrace();

		}

	}

}
