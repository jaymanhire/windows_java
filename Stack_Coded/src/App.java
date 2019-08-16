
public class App {

	public static void main(String[] args) {

		Stack theStack = new Stack(3);
//		theStack.push(20);
//		theStack.push(40);
//		theStack.push(60);
//		theStack.push(80);

		String str1 = "Reverse me";

		char[] myStrReverse = str1.toCharArray();

		// System.out.println(stringReverse_2(myStrReverse));

		while (!theStack.isEmpty()) {
			long value = theStack.pop();
			System.out.println(value);
		}

		System.out.println(reverseString("Hello"));

		stringReverse_2(myStrReverse);
	}

	public static String reverseString(String str) {
		int stackSize = str.length(); // get max stack size
		Stack theStack = new Stack(stackSize); // we make the stack
		for (int j = 0; j < str.length(); j++) {
			char ch = str.charAt(j);
			theStack.push(ch);
		}

		String result = "";
		while (!theStack.isEmpty()) {
			char ch = theStack.pop();
			result = result + ch;
		}

		return result;

	}

	public static void stringReverse_2(char[] str) {
		for (int i = str.length - 1; i >= 0; i--) {
			System.out.print(str[i]);
		}

	}

}
