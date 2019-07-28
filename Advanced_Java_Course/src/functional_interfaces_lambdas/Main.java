package functional_interfaces_lambdas;

public class Main {

	public static void main(String[] args) {

		GreetingMessage gm = new GreetingMessage() {

			@Override
			public void greet(String name) {
				System.out.println("Hello " + name);
			}
		};
		gm.greet("Jay");

		GreetingMessage gm2 = (String name) -> {
			System.out.println("Hello " + name);
		};
		gm2.greet("Jay");

		MessagePrinter mp = () -> {
			System.out.println("This is a message");
		};
		mp.printMessage();
	}

}
