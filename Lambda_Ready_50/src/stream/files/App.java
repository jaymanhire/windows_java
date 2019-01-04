package stream.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) throws IOException {		
		
	/*	Stream<String> lines = Files.lines(Paths.get("files/wordFile.txt"));
		lines.sorted()
		.filter(l -> l.length() > 6)  
		.forEach(x -> System.out.println(x));	
		
		lines.close(); */
		
		// much better to filter the list first (less data to sort)
		
			Stream<String> lines2 = Files.lines(Paths.get("files/wordFile.txt"))
			.filter(l -> l.length() > 6)
			.sorted();				
			lines2.forEach(x -> System.out.println(x));	
				
			lines2.close();
		
	}

}
