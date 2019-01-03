
public class App {

	public static void main(String[] args) {

		Human tom = new Human();
		// walker(tom);

		Robot wale = new Robot();
		// walker(wale);

		// This lambda is an implementation of the Walkable interface
		// Anonymous implementation of an abstract method listed in the
		// functional interface
		walker(() -> System.out.println("Custom object walking..."));

		// Lambdas type must be a functional interface-> an interface with 1
		// abstract method.
		Walkable aBlockOfCode = () -> {
			System.out.println("Custom object walking...");
			System.out.println("The object tripped...");
		};
		walker(aBlockOfCode);

		ALambdaInterface helloVar = () -> System.out.println("hello there, I'm a lambda expression!");
		Calculate sumVar = (a, b) -> a + b;
		helloVar.someMethod();
		System.out.println(sumVar.compute(4, 6));

		Calculate nonZeroDivider = (a, b) -> {
			if (a == 0) {
				return 0;
			}
			return a / b;
		};
		System.out.println(nonZeroDivider.compute(40, 20));

		MyGenericInterface<String> strRev = (s) -> {
			String result = "";
			for (int i = s.length() - 1; i >= 0; i--) {
				result = result + s.charAt(i);
			}
			return result;
		};
		System.out.println("'Vehicle' reversed: " + strRev.work("Vehicle"));

		MyGenericInterface<Integer> factorial = (number) -> {
			int result = 1;
			for (int i = result; i <= number; i++) {
				result = result * i;
			}
			return result;
		};
		System.out.println("5 factorial: " + factorial.work(6));
	}

	public void sayHello() {
		System.out.println("hello there");
	}

	public int sum(int arg1, int arg2) {
		return arg1 + arg2;
	}

	public int nonZeroDivide(int arg1, int arg2) {
		if (arg1 == 0) {
			return 0;
		}
		return arg1 / arg2;
	}

	public String reverse(String str) {
		String result = "";
		for (int i = str.length() - 1; i > 0; i--) {
			result = result + str.charAt(i);
		}
		return result;
	}

	public int factorial(int number) {
		int result = 1;
		for (int i = result; i <= number; i++) {
			result = result * i;
		}
		return result;
	}

	public static void walker(Walkable walkableEntity) {
		walkableEntity.walk();
	}

	interface Calculate {
		public int compute(int a, int b);
	}

	interface MyGenericInterface<T> {
		public T work(T t);
	}

}
