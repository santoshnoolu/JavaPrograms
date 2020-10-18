package com.Santosh;

public class PowerOfANumber {

	public static void main(String[] args) {
		int n=8,p=3;
		power(n,p);
	}
	public static void power(int n, int p)
	{
		int sum=1;
		for(int i=1;i<=p;i++)
		{
			sum=sum*n;
		}
		System.out.println(sum);


	}
}
