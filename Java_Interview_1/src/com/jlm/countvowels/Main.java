package com.jlm.countvowels;

public class Main {

	public static void countVowelsAndConsonants(String input) {
		int vowelCount = 0;
		int consonantCount = 0;
		String vowels = "aeiou";
		String normalized = (input.toLowerCase()).trim();
		char[] inputCharArray = normalized.toCharArray();

		for (char c : inputCharArray) {
			if (vowels.indexOf(c) != -1) {
				vowelCount++;
			} else if (c != ' ') {
				consonantCount++;
			}
		}
		System.out.println("There are " + vowelCount + " vowels in the String " + input);
		System.out.println("There are " + consonantCount + " consonants in the String " + input);
	}

	public static void findNumberOfVowelsAndConsonantsWithAscii(String input) {
		int vowelsCount = 0;
		int consonantCount = 0;
		String vowels = "aeiouyAEIOUY";
		for (int i = 0; i < input.length(); i++) {
			int asciiValue = (int) input.charAt(i);
			// check if character is a letter
			if ((asciiValue <= 90 && asciiValue >= 65) || asciiValue <= 122 && asciiValue >= 97) {
				if (vowels.contains(Character.toString(input.charAt(i)))) {
					vowelsCount++;
				} else {
					consonantCount++;
				}
			}
		}

		System.out.println("There are " + vowelsCount + " vowels in " + input);
		System.out.println("There are " + consonantCount + " consonants in " + input);
		System.out.println();
	}

	public static void main(String[] args) {

		String s1 = "Hello";
		String s2 = " there is a quiet mouse";
		String s3 = "I am happy";

		countVowelsAndConsonants(s1);
		findNumberOfVowelsAndConsonantsWithAscii(s1);

		System.out.println();

		countVowelsAndConsonants(s2);
		findNumberOfVowelsAndConsonantsWithAscii(s2);
		
		System.out.println();

		countVowelsAndConsonants(s3);
		findNumberOfVowelsAndConsonantsWithAscii(s3);

	}

}
