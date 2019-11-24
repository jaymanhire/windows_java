
public class App {

	public static void main(String[] args) {
		
		float sideB = 0;
		System.out.printf("Side B = %.2f\n", sideB);

		MyMath myMath = new MyMath();
		myMath.takeInputs();
		myMath.processInputs();
		myMath.selectFunction();

	}

}
