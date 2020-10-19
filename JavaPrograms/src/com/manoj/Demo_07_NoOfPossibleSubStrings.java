package com.manoj;

import java.util.Scanner;

public class Demo_07_NoOfPossibleSubStrings {

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
			System.out.println(
					"OutPut: No substrings possibile with given input string :: Please enter a valid input string:");
			inputString = scan.nextLine();
			getOutput(inputString.trim());
		} else {
			getPossibleSubStrings(inputString);
		}
	}

	public static void getPossibleSubStrings(String inputString) {

		System.out.println("Input : Given input string is :" + inputString);
		int noOfSubStrings = 0;
		for (int i = 0; i < inputString.length(); i++) {
			for (int j = i + 1; j <= inputString.length(); j++) {
				System.out.print(" || " + inputString.substring(i, j));
				noOfSubStrings++;
			}
		}
		System.out.println();
		System.out.println("No of possible substrings:" + noOfSubStrings);
	}

}
