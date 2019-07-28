package directories_example;

import java.io.File;
import java.io.FilenameFilter;

public class App {

	public static void main(String[] args) {

		FilenameFilter filter = (file, fileName) -> {
			return fileName.contains(".");

		};

		// "." current dir
		String[] contents = new File(".").list(filter); // passing in filter to list only files not dir's
		for (String file : contents) {
			System.out.println(file);
		}

		new File("JaysDirectory").mkdir();

	}

}
