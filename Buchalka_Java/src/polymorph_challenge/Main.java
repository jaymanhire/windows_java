package polymorph_challenge;

class Car {

	private boolean engine;
	private int cylinders;
	private String name;
	private int wheels;

	public Car(int cylinders, String name) {

		this.engine = true;
		this.cylinders = cylinders;
		this.name = name;
		this.wheels = 4;
	}

	public int getCylinders() {
		return cylinders;
	}

	public String getName() {
		return name;
	}

	public String startEngine() {
		return "Car -> start engine()";
	}

	public String accelerate() {
		return "Car -> accelerate()";
	}

	public String brake() {
		return "Car -> brake()";
	}
}

	class Ford extends Car {

		public Ford(int cylinders, String name) {
			super(cylinders, name);

		}

		@Override
		public String startEngine() {
			return "Ford -> start engine()";
		}

		@Override
		public String accelerate() {
			return "Ford -> accelerate()";
		}

		@Override
		public String brake() {
			return "Ford -> brake()";
		}

	}

	public class Main {
		public static void main(String[] args) {

			Car car = new Car(8, "Base car");
			System.out.println(car.startEngine());
			System.out.println(car.accelerate());
			System.out.println(car.brake());

			Ford ford = new Ford(6, "Mustang");
			System.out.println(ford.accelerate());
			System.out.println(ford.startEngine());
			System.out.println(ford.brake());

		}
	}
