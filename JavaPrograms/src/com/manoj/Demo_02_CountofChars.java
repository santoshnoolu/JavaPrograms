package com.manoj;

import java.util.HashMap;
import java.util.Scanner;

public class Demo_02_CountofChars {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a String");
		String input = scan.nextLine();
		scan.close();
		System.out.println("Input  :" + input);
		System.out.println("Output :" + getCountofCharsinString(input));
	}

	public static HashMap<Character, Integer> getCountofCharsinString(String inputString) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char[] c = inputString.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (c[i] != ' ') {
				if (map.containsKey(c[i]))
					map.put(c[i], map.get(c[i]) + 1);
				else
					map.put(c[i], 1);
			}
		}
		return map;
	}
}
