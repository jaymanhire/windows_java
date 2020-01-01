package com.speedconverter;

public class SpeedConverter {

	public static void main(String[] args) {

		System.out.println(toMilesPerHour(75.114));
		printConversion(75.114);

	}

	public static long toMilesPerHour(double kilometersPerHour) {

		double milesPerHour = Math.round(kilometersPerHour * 0.6214);

		if (kilometersPerHour < 0) {
			return -1;
		} else {
			// return Math.round(milesPerHour);
			return (long) milesPerHour;

		}
	}

	public static void printConversion(double kilometersPerHour) {

		if (kilometersPerHour < 0) {
			System.out.println("Invalid Value.");
		} else {
			System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(75.114) + " mi/h");
		}
	}
}
//0.6214