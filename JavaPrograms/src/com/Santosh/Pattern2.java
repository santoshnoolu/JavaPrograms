package com.Santosh;

public class Pattern2 {

	public static void main(String[] args) {
		int n=6;
		Pattern2 obj= new Pattern2();
	obj.pattern(n);
		
	}
	public void pattern(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
