package com.Santosh;

public class SumOfAllDigits {
public static void main(String s[])
{
	int n=67564;
	sumOfDigits(n);
	}

public static void sumOfDigits(int n)
{
	int sum=0;
	int rem;
	while(n>0)
	{
		rem=n%10;
		sum=sum+rem;
		n=n/10;
	}
	System.out.println("The sum of all digits in the given number is "+sum);
	}
}
