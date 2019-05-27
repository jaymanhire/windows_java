package ds.stack.stringreverse;

public class App {

	public static void main(String[] args) {
		

		System.out.println(reverseString("Hello"));
	}

	public static String reverseString(String str) {
		int stackSize = str.length(); // get the max stack size
		Stack theStack = new Stack(stackSize); // we make the stack
		for (int j = 0; j < str.length(); j++) {
			char ch = str.charAt(j); // getting a char from the input string
			theStack.push(ch);
		}

		String result = "";
		while (!theStack.isEmpty()) {
			char ch = theStack.pop();
			result = result + ch; // appending to the output
		}

		return result;
	}
}
