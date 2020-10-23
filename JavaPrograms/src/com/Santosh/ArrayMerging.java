package com.Santosh;


public class ArrayMerging {
	public static void main(String s[])
	{
	int a[]={21,1,93,48,99,72,34};	
	int b[]={32,74,2};
	arrayMerge(a,b);
	}
public static void arrayMerge(int a[],int b[])
{
	int c[]=new int[a.length+b.length];
	int count=0;
	for(int i=0;i<a.length;i++)
	{
		
	c[i]=a[i];
	count++;
	}
	for(int j=0;j<b.length;j++)
	{
		c[count++]=b[j];
	}
	for(int k=0;k<c.length;k++)
	{
		System.out.print(c[k]+" ");
	}
	}
}
