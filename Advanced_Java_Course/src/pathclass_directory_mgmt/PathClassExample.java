package pathclass_directory_mgmt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathClassExample {

	public static void main(String[] args) {
		
		Path path = Paths.get("src/pathclass_directory_mgmt/HelloWorld.txt");
		
		try {
			boolean fileDeleted = Files.deleteIfExists(path);
			System.out.println(fileDeleted);
		} catch (IOException e) {
			e.printStackTrace();
		}
		Path path2 = Paths.get("/myDirectory/example.txt");
		System.out.println(path2.getParent());
		System.out.println(path2.getRoot());
		System.out.println(path2.getFileName());

	}
	

}
