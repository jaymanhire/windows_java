package functional_interfaces_prelambda;

public class Main {

	public static void main(String[] args) {
		
		GreetingMessage gm = new GreetingMessage() {
			
			@Override
			public void greet(String name) {
				System.out.println("Hello " + name);
			}
		};
		
		gm.greet("Jay");

	}
	// This is all a functional interface is, allows programmer to pass code around as data.
	// This verbose code is improved by Lambdas to implement functional interfaces

}
