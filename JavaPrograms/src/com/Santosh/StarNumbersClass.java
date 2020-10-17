package com.Santosh;

public class StarNumbersClass {

	public static void main(String s[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			for(int k=1;k<i;k++)
			{
				System.out.print(k);
			}
			System.out.println();
		}
	}
	
}
