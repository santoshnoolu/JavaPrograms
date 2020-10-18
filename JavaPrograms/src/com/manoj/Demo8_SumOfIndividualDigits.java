package com.manoj;

import java.util.Scanner;

public class Demo8_SumOfIndividualDigits {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter number :");
		long num = scan.nextLong();

		scan.close();

		long result = sumOfigits(num);
		// long result = sumOfigits(12345678910L);
		System.out.println("Output :" + result);

	}

	public static long sumOfigits(long num) {
		long n = 0, result = 0;
		while (num > 0) {
			n = num % 10;
			result += n;
			num = num / 10;
		}
		return result;
	}
}