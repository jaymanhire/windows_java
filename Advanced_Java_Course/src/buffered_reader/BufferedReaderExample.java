package buffered_reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {

	public static void main(String[] args) {
		
		// BufferedReader is synchronized. Thread safe.

		File myFile = new File("src/buffered_reader/example.txt");
		try {
			BufferedReader reader = new BufferedReader(new FileReader(myFile));
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			reader.close();
		} catch (IOException e) {
			System.out.println("Problem Reading File: " + myFile);

		}

	}

}
