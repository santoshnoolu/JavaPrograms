package com.manoj;

import java.util.Scanner;

public class Demo_08_SumOfIntinArrays {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter no of parameters :");
		int n = scan.nextInt();
		int intArr[] = new int[n];

		for (int i = 0; i < n; i++) {
			int j = i + 1;
			System.out.print("Please enter input" + j + ":");
			intArr[i] = scan.nextInt();
		}

		/* int i[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; */

		int result = sumOfIntArray(intArr);
		System.out.println("Output :" + result);
		scan.close();

	}

	public static int sumOfIntArray(int[] arr) {
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			result += arr[i];
		}
		return result;
	}
}
