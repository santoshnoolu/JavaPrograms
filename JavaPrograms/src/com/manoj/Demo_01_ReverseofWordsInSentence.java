package com.manoj;

import java.util.Scanner;

public class Demo_01_ReverseofWordsInSentence {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the string to be reversed");
		String inputString = scan.nextLine();
		scan.close();

		String reverseSentence = reverseString(inputString);
		String reverseStrings = reverseWordsofSentence(inputString);
		System.out.println("inputString 			: " + inputString);
		System.out.println("reverseSentence 		: " + reverseSentence);
		System.out.println("reverseStringsOfSentence        : " + reverseStrings);
	}

	public static String reverseString(String str) {
		String outputString = "";
		char c[] = str.toCharArray();
		for (int i = str.length() - 1; i >= 0; i--) {
			outputString = outputString + c[i];
		}
		return outputString;
	}

	public static String reverseWordsofSentence(String str) {
		String revSentence = "";
		String revString = "";
		String[] SplitSTrings = str.split(" ");

		for (int j = 0; j < SplitSTrings.length; j++) {
			revString = reverseString(SplitSTrings[j]);

			if (!revSentence.isEmpty())
				revSentence = revSentence + " ";

			revSentence = revSentence + revString;
		}
		return revSentence;
	}

}
