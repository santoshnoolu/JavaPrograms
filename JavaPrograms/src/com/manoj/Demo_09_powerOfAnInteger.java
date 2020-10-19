package com.manoj;

import java.util.Scanner;

public class Demo_09_powerOfAnInteger {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter number :");
		int number = scan.nextInt();

		System.out.println("Please enter power either a +ve / -ve Number :");
		int power = scan.nextInt();

		float result = powerOfAnInteger(number, power);

		System.out.println("input  :" + number + " powerOf " + power);
		System.out.println("Output :" + result);
		scan.close();
	}

	public static float powerOfAnInteger(int number, int power) {
		float result = 1;
		for (int i = 1; i <= Math.abs(power); i++) {
			result = result * number;
		}
		if (power < 0) {
			result = 1 / result;
		}
		return result;
	}
}
