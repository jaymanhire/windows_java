package stream.files2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) throws IOException {
		
	List<String> words = Files.lines(Paths.get("files/wordFile.txt"))
				.filter(x -> x.contains("th"))
				.collect(Collectors.toList());   //  terminal operation(;)
		words.forEach(x -> System.out.print(x + "* "));	
		
		System.out.println("\n-------------------------------");
		
		Stream<String> rows = Files.lines(Paths.get("files/stockDataCsv.txt"));
		int rowCount = (int) rows
				.map(x -> x.split(","))  // because the data is comma seperated
				.filter(x -> x.length > 3)
				.count();
		System.out.println(rowCount + " good rows.");
		
		rows.close();
		
		System.out.println("\n-------------------------------");
		
		Stream<String> rows2 = Files.lines(Paths.get("files/stockDataCsv.txt"));
		rows2.map(x -> x.split(","))  // 'x' mapping each line to the spitting on a comma. 'x' reps the entire line as a text. The lambda splits the line and treats it as ana aaray
		.filter(x -> x.length > 3)
		.filter(x -> Integer.parseInt(x[1].trim()) > 15) // trim out whitespace. Index pos[1] is > 15
		.forEach(x -> System.out.println(x[0].trim() + " " + x[2].trim() + " " + x[3].trim()));
		
		rows2.close();
		
		

	}

}
