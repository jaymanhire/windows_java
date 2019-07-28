package creating_files;

import java.io.File;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		
		File myFile = new File("C:\\Users\\JLM\\Desktop\\myFile2.txt");
		
		try {
			boolean fileCreated = myFile.createNewFile();
			System.out.println(fileCreated);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		

	}

}
