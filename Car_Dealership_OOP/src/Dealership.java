
public class Dealership {

	public static void main(String[] args) {

		Customer customer1 = new Customer("Tom", "123 Anything St.", 25000);

		Vehicle vehicle = new Vehicle("BMW", "M5", 20000);

		Employee employee = new Employee();

		customer1.purchaseCar(vehicle, employee, false);

		Vehicle car = new Vehicle("BMW", "M5", 20000);

		boolean value = car.equals(vehicle);
		System.out.println(value);

	}

}
