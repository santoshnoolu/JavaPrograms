package com.manoj;

import java.util.Scanner;

public class Demo_10_ReverseArrayAndSearchArrayWithIndex {
	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int searchEle = 3;

		/*
		 * Scanner scan = new Scanner(System.in); System.out.println(
		 * "Please enter no of parameters :"); int n = scan.nextInt(); int arr[]
		 * = new int[n];
		 * 
		 * for (int i = 0; i < n; i++) { int j = i + 1; System.out.print(
		 * "Please enter input" + j + ":"); arr[i] = scan.nextInt(); }
		 * 
		 * System.out.println("Please enter element to be search :"); int
		 * searchEle = scan.nextInt(); scan.close();
		 */
		printReverseArray(arr);
		searchArrayParticularNumber(arr, searchEle);
		searchNumberReturnIndex(arr, searchEle);

	}

	public static void printReverseArray(int[] intArr) {
		System.out.print("printReverseArray  :");
		for (int i = intArr.length - 1; i >= 0; i--) {
			System.out.print(intArr[i] + " ");
		}
		System.out.println(" ");
	}

	public static void searchArrayParticularNumber(int[] intArr, int n) {
		boolean flag = false;
		System.out.print("searchArrayParticularNumber :");
		for (int i = intArr.length - 1; i >= 0; i--) {
			if (intArr[i] == n) {
				System.out.print("Element present in Array");
				flag = true;
				break;
			}
		}
		if (!flag)
			System.out.print("Element not present in Array");
		System.out.println(" ");
	}

	public static void searchNumberReturnIndex(int[] intArr, int n) {
		System.out.print("searchNumberReturnIndex :");
		boolean flag = false;

		for (int i = intArr.length - 1; i >= 0; i--) {
			if (intArr[i] == n) {
				System.out.print(i);
				flag = true;
				break;
			}
		}
		if (!flag)
			System.out.print("Element not present in Array");
		System.out.println(" ");
	}

}
