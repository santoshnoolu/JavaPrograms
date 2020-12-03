package com.Santosh;

public class AllSubstringsInAString {
	public static void main(String s[])
	{
		String strinp="Welcome";
		allSubStrings(strinp);
	}
	public static void allSubStrings(String strinp)
	{

		for(int i=0;i<strinp.length();i++)
		{
			for(int j=i+1;j<=strinp.length();j++)
			{
				System.out.println(strinp.substring(i,j));
			}
		}
	}
	//update message for Branch merge
}
