package reverse_string;

public class StringReverse {

	public static void main(String[] args) {

		String str = "Jay is cool";

		char[] revString = str.toCharArray();

		for (int i = revString.length - 1; i >= 0; i--) {
			System.out.print(revString[i]);
		}

	}

}
