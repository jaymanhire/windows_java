package switchy;

public class App {

	public static void main(String[] args) {

		/*
		 * int value = 3;
		 * 
		 * if (value == 1) {
		 * 
		 * } else if (value == 2) { System.out.println("Value is 2"); } else {
		 * System.out.println("Value not 1 or 2"); }
		 */

//		
//		int switchValue = 5;
//
//		switch (switchValue) {
//		case 1:
//			System.out.println("Value is 1");
//			break;
//		case 2:
//			System.out.println("Value is 2");
//			break;
//		case 3:
//		case 4:
//		case 5:
//			System.out.println("Value is 3, 4, or 5");
//			System.out.println("Actually, value is " + switchValue);
//			break;
//		default:
//			System.out.println("Value not valid");
//			break;
//		}

		char myChar = 'D';

		switch (myChar) {
		case 'A':
			System.out.println("Character is 'A'");
			break;
		case 'B':
			System.out.println("Character is 'B'");
			break;
		case 'C':
			System.out.println("Character is 'C'");
			break;
		case 'D':
		case 'E':
		case 'F':
			System.out.println("Character is not 'D', 'E', or 'F'");
			System.out.println("Chracter is " + myChar);
			break;
		default:
			System.out.println("Invalid character.....");
			break;
		}
		
		String month = "january";
		
		switch(month.toLowerCase()) {
		case "january":
			System.out.println("Month is January");
			break;
		case "february":
			System.out.println("Month is February");
			break;
		case "march":
			System.out.println("Month is March");
			break;
			default:
				System.out.println("Invalid...");
		}

	}
}