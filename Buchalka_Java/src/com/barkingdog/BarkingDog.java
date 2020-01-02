package com.barkingdog;

public class BarkingDog {

	public static void main(String[] args) {

		System.out.println(shouldWakeUp(true, 0));

	}

	public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

		if ((hourOfDay < 8 && hourOfDay >= 0 || hourOfDay > 22 && hourOfDay < 24) && barking) {
			return true;
		} else if ((hourOfDay <= 0 || hourOfDay > 23) && barking) {
			return false;
		} else {
			return false;

		}

	}
}
