package com.Santosh;

public class ArraySortDec {
	public static void main(String s[])
	{
	int a[]={21,1,93,48,99,72,34};	
	arraySortDec(a);
	}

	public static void arraySortDec(int a[])
	{
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int k=0;k<a.length;k++)
		{
			System.out.println(a[k]);
		}
	}
}
