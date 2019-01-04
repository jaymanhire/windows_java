package streams.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) {

		// Integer stream with skip		
	/*	 IntStream
		 .range(1, 10) 
		 .skip(5)// skip first 5 elements of the stream 
		 .forEach((x) -> System.out.print(x));
		 System.out.println();	*/
		 

		// Integer stream with sum
	/*	int val = IntStream
		.range(1, 5)
		.sum();
		System.out.println(val);	*/
		
		
	/*	Stream.of("Hello","bottle","Africa")
		.sorted()
		.findFirst() // terminal operation
		.ifPresent((x) -> System.out.println(x));	// prevents null pointer	*/		
		
		
	/*	String[] items = {"car","computer","toothpaste","box","pencil","tent","door","toy"};
		Stream.of(items)
		.filter((x) -> x.startsWith("t"))   // intermediate operation
		.sorted()
		.forEach(x -> System.out.println(x + " "));	*/
		
	/*	Arrays.stream(new int[] {2,4,6,8,10})
		.map((x) -> x*x)
		.average()
		.ifPresent(n -> System.out.println(n));		*/
		
		// .asList converts the list of items to a Collection structure
		List<String> listOfItems = Arrays.asList("car","computer","toothpaste","box","pencil","tent","door","toy");
				listOfItems.stream()
				.map(x -> x.toUpperCase())
				.filter(x -> x.startsWith("C"))
				.sorted()
				.forEach(x -> System.out.println(x));	
			
	}

}
