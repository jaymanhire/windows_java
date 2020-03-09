package oop_hamburger;

public class Main {

	public static void main(String[] args) {
		
		Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
		double price = hamburger.itemizeHamburger();
		
		hamburger.addHamburgerAddition1("Tomato", .50);
		hamburger.addHamburgerAddition2("Lettuce", .35);
		hamburger.addHamburgerAddition3("Cheese", .70);
		
		
		System.out.println("Total burger price: " + hamburger.itemizeHamburger());
		
		System.out.println();
		
		HealthyBurger healthyBurger = new HealthyBurger("Turkey", 4.95);		
		healthyBurger.addHamburgerAddition1("Egg", .75);
		healthyBurger.addHealthAddition1("Tofu", 1.10);
		System.out.println("Total healthy Burger price: " + healthyBurger.itemizeHamburger());

	}

}
