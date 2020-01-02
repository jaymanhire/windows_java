package isleapyear;

public class LeapYearCalculator {

	public static void main(String[] args) {

		System.out.println(isLeapYear(-1752));

	}

	public static boolean isLeapYear(int year) {

		if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0 && (year >= 1 && year <= 9999))
			return true;
		if (year % 4 == 0 && year % 100 != 0 && (year >= 1 && year <= 9999))
			return true;
		if (year % 4 != 0)
			return false;

		return false;

	}

}
