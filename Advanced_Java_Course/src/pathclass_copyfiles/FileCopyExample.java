package pathclass_copyfiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
 
public class FileCopyExample {
 
	public static void main(String[] args) {

		Path source = Paths.get("C:\\Users\\JLM\\eclipse-workspace\\Advanced_Java_Course\\example.txt");
		Path dest = Paths.get("C:\\Users\\JLM\\eclipse-workspace\\Advanced_Java_Course\\newExample.txt");

		try {
			Files.copy(source, dest, StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
