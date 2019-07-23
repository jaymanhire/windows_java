package com.jlm.stringfunctions;

public class Main {

	public static void main(String[] args) {

		String p = "   Panda";
		String f = " Fish ";
		String h = "Horse     ";
		String c = " Cat";
		String nothing = " ";

		String[] strings = { p, f, h, c, nothing };

		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}

		for (String s : strings) {
			if (!s.isEmpty()) {
				System.out.println(s.trim());

				// if(!s.isEmpty()) {
				System.out.println("Not empty: " + s);
				System.out.println(s.toUpperCase());
			}
		}

	}
}
