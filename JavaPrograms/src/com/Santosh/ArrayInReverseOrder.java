package com.Santosh;

public class ArrayInReverseOrder {
public static void main(String s[])
{
	int []a={34,45,66,23,9,82,41};
	reverseArray(a);
}
public static void reverseArray(int[] arr)
{
	System.out.print("Given Array : ");
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	System.out.print("Reversed Array : ");
	for(int i=arr.length-1;i>=0;i--)
	{
		System.out.print(arr[i]+" ");
	}
	
	}
}
