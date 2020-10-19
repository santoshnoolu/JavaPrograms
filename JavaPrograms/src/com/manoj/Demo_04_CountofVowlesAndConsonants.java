package com.manoj;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo_04_CountofVowlesAndConsonants {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter input :");
		String inputString = scan.nextLine();
		scan.close();
		// sample input ---- A a ee EE iii III oooo OOOO uuuuu UUUUU zZ
		System.out.println("Input :" + inputString);
		System.out.println("----Below is the output----");
		countOfVowelsAndConsonants(inputString);

	}

	private static void countOfVowelsAndConsonants(String inputString) {

		int vowelCount = 0, consonantCount = 0;
		HashMap<Character, Integer> vowelsConsonantsMap = new HashMap<>();

		// char c[] = inputString.toUpperCase().toCharArray();
		char c[] = inputString.toCharArray();

		for (int i = 0; i < c.length; i++) {
			char k = c[i];
			if (c[i] != ' ') {
				if (!vowelsConsonantsMap.containsKey(c[i]))
					vowelsConsonantsMap.put(c[i], 1);
				else
					vowelsConsonantsMap.put(c[i], vowelsConsonantsMap.get(c[i]) + 1);

				if (k == 'a' || k == 'A' || k == 'e' || k == 'E' || k == 'i' || k == 'I' || k == 'o' || k == 'O'
						|| k == 'u' || k == 'U') {
					vowelCount++;
				} else {
					consonantCount++;
				}
			}

		}
		System.out.println("No of Vowels :" + vowelCount + " || No of Consonants :" + consonantCount);
		System.out.print("Printing Vowels :");
		for (Map.Entry<Character, Integer> k : vowelsConsonantsMap.entrySet()) {
			if (k.getKey() == 'a' || k.getKey() == 'A' || k.getKey() == 'e' || k.getKey() == 'E' || k.getKey() == 'i'
					|| k.getKey() == 'I' || k.getKey() == 'o' || k.getKey() == 'O' || k.getKey() == 'u'
					|| k.getKey() == 'U') {
				System.out.print(k.getKey() + "--" + k.getValue() + " || ");

			}

		}
		System.out.println();
		System.out.print("Printing Consonants :");
		for (Map.Entry<Character, Integer> k : vowelsConsonantsMap.entrySet()) {
			if (k.getKey() != 'a' && k.getKey() != 'A' && k.getKey() != 'e' && k.getKey() != 'E' && k.getKey() != 'i'
					&& k.getKey() != 'I' && k.getKey() != 'o' && k.getKey() != 'O' && k.getKey() != 'u'
					&& k.getKey() != 'U') {
				System.out.print(k.getKey() + "--" + k.getValue() + " || ");

			}
		}
		System.out.println();
		System.out.println();
		System.out.println("------Java 8 Methods using Lambda Expression-------");
		System.out.print("Printing Vowels :");
		vowelsConsonantsMap.forEach((k, v) -> {
			if (k == 'a' || k == 'A' || k == 'e' || k == 'E' || k == 'i' || k == 'I' || k == 'o' || k == 'O' || k == 'u'
					|| k == 'U')
				System.out.print(k + "--" + v + " || ");
		});
		System.out.println();
		System.out.print("Printing Consonants :");
		vowelsConsonantsMap.forEach((k, v) -> {
			if (k != 'a' && k != 'A' && k != 'e' && k != 'E' && k != 'i' && k != 'I' && k != 'o' && k != 'O' && k != 'u'
					&& k != 'U')
				System.out.print(k + "--" + v + " || ");
		});
	}
}