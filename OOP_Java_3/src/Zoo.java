
public class Zoo {

	public static void main(String[] args) {

		Flyable flyingBird = new Sparrow(2, "male", 2);
		flyingBird.fly();

		System.out.println();

		// Flyable flyingBird2 = new Bird(5, "M", 2);

		Sparrow sparrow1 = new Sparrow(5, "Male", 1);
		Animal sparrow2 = new Sparrow(5, "Male", 1);
		sparrow1.move();
		sparrow1.fly();

		Animal fish1 = new Fish(5, "Female", 23);
		Fish fish2 = new Fish(5, "Female", 23);
		fish2.move();
		fish1.move();
		
		System.out.println();
		moveAnimal(sparrow1);
		moveAnimal(fish1);

	}

	public static void moveAnimal(Animal animal) {
		animal.move();
	}

}