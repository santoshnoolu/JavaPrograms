package com.Santosh;

public class StarPyramidClass {
	public static void main(String s[])
	{
		int n=10;
		StarPyramid(n);

	}
	public static void StarPyramid(int n)
	{
		int a=n;
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			for(int m=1;m<i;m++)
			{
				System.out.print("*");
			}
			for(int l=n;l>1;l--)
			{
				System.out.print(" ");
			}
			n=n-1;
			System.out.println();
		}
	}
}
