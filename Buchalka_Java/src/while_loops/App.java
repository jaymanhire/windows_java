package while_loops;

public class App {

	public static void main(String[] args) {

		System.out.println(isEvenNumber(45));

		int count = 1;
		while (count != 6) {
			System.out.println("Count value: " + count);
			count++;
		}
		
		System.out.println();
		int number = 4;
		int finishNumber = 20;
		int evenNumsFound = 0;
		
		while(number <= finishNumber) {
			number++;
			if(!isEvenNumber(number)) {
				continue;
			}
			evenNumsFound++;
			System.out.println("Even number " + number);
			System.out.println("Even numbers found: " + evenNumsFound);
		}
	}

//		count = 1;
//		do {
//			System.out.println("Count value: " + count);
//			count++;
//			
//			if(count == 151) {
//				break;
//			}
//		} while (count != 600);
//	}

	public static boolean isEvenNumber(int number) {
		if (number % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
