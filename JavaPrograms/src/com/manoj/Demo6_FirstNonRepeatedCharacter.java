package com.manoj;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo6_FirstNonRepeatedCharacter {

	static Scanner scan;
	static String inputString;

	public static void main(String[] args) {

		scan = new Scanner(System.in);
		System.out.println("Please enter input string:");
		inputString = scan.nextLine();
		getOutput(inputString.trim());
		scan.close();
	}

	public static void getOutput(String inputString) {

		if (inputString.length() == 0 || inputString == null) {
			System.out.println("Your input is not valid :: Please enter a valid input string:");
			inputString = scan.nextLine();
			getOutput(inputString.trim());
		} else {
			System.out.println("Input : Given input string is :" + inputString);
			Character firstNonRepeatedChar = firstNonRepeatedCharacter(inputString);
			if (firstNonRepeatedChar != null)
				System.out.println("OutPut: First Non Repeated Character of given String is :" + firstNonRepeatedChar);
			else
				System.out.println("OutPut: No non repeated character in the given input string");
		}
	}

	public static Character firstNonRepeatedCharacter(String inputString) {

		LinkedHashMap<Character, Integer> linkedHashMap = new LinkedHashMap<>();
		char[] ch = inputString.toCharArray();
		Character nonRepeatedChar = null;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] != ' ') {
				if (!linkedHashMap.containsKey(ch[i])) {
					linkedHashMap.put(ch[i], 1);
				} else {
					linkedHashMap.put(ch[i], linkedHashMap.get(ch[i]) + 1);
				}
			}
		}

		for (Map.Entry<Character, Integer> entry : linkedHashMap.entrySet()) {
			if (entry.getValue() == 1) {
				nonRepeatedChar = entry.getKey();
				break;
			}
		}
		return nonRepeatedChar;
	}
}
