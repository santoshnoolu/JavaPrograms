package com.manoj;

public class Demo5_PyramidProgram {

	public static void main(String[] args) {
		System.out.println("Pyramid Program");
		printPyramid(5);
	}

	private static void printPyramid(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(' ');
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			for (int j = i - 1; j >= 1; j--) {
				System.out.print("*");
			}
			for (int j = 1; j <= n - i; j++) {
				System.out.print(' ');
			}
			System.out.println();
		}
	}

}
