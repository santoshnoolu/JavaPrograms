package com.Santosh;

public class SearchANumberAndIndexInArray {

	public static void main(String s[])
	{
		int []a={34,45,66,23,9,82,41};
		int n=66;
		findNum_IndexInArray(a,n);

	}
	public static void findNum_IndexInArray(int arr[],int n)
	{
		int index = 0;
		boolean flag=false;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==n)
			{
				flag=true;
				index=i;
				break;
			}
			else
			{
				flag=false;
			}
		}
		if(flag)
			System.out.println("The number "+n+" is found in the array at index "+index);
		else
			System.out.println("The number "+n+" is not found in the array");
	}
}
