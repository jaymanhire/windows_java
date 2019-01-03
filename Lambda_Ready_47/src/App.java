
public class App {

	public static void main(String[] args) {
		
		Human tom = new Human();
		//walker(tom);

		Robot wale = new Robot();
		// walker(wale);

		// This lambda is an implementation of the Walkable interface
		/*
		 * walker(() -> { System.out.println("Custom object walking...");
		 * System.out.println("The object tripped...");
		 * 
		 * }); }
		 */
		
		walker(() ->System.out.println("Custom object walking..."));
		
		//Lambdas type must be a functional interface-> an interface with 1 abstract method.
		Walkable aBlockOfCode = () -> {
			System.out.println("Custom object walking...");
			System.out.println("The object tripped...");
		};
		walker(aBlockOfCode);

	}
	  //convert to Lambda expression
		/*walker(new Walkable() {		
			
			@Override
			public void walk() {
				System.out.println("Custom object walking...");				 
			}
		});		

	}*/
	
	public static void walker(Walkable walkableEntity) {
		walkableEntity.walk();
	}

}
