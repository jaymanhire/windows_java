package lambda.practical;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class App {

	public static void main(String[] args) {
		
		List<Car> cars = Arrays.asList(
				new Car("Honda","Accord","Red", 22300),
				new Car("Honda","Civic","Blue", 17700),
				new Car("Toyota","Land Cruiser","White", 48500),
				new Car("Toyota","Corolla","Black", 16200),
				new Car("Toyota","Camry","Blue", 24000),
				new Car("Nissan","Sentra","White", 17300),
				new Car("Mitsubishi","Lancer","White", 20000),
				new Car("Jeep","Wrangler","Red", 24500)
		);
		
		Function<Car, String> priceAndColor = (c) -> "price = " + c.getPrice() + " color = " + c.getColor();
		String stringcar = priceAndColor.apply(cars.get(0));
		System.out.println(stringcar);
		
		
		//printCarByColor(cars, "Red");
		//printCarsPriceRange(cars, 15000, 18500);
		
	/*	System.out.println("Printing cars between 18000 and 22000");		
		printCars(cars, (c) -> c.getPrice() >= 18000 && c.getPrice() <= 22000);
		
		System.out.println("Printing blue cars.");
		printCars(cars, (c) ->  c.getColor().equals("Blue"));
	}

	public static void printCars(List<Car> cars, Predicate<Car> predicate) {
		for (Car c : cars) {
			if (predicate.test(c)) {
				c.printCar();
			}   
		}*/

	}

}
