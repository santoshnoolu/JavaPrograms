package com.Santosh;

public class ReverseOfWords {
	public static void main(String args[])
	{
		String strInput="Welcome to Java";
		reverseOfWords(strInput);
	}
	public static void reverseOfWords(String strInput)
	{
		/*
		 1. Split the word based on Spaces
		 2. iterate each word
		 3. Reverse characters of each word using for loop
		 4. Join the reversed words
		 */
	
	String strWords[]=strInput.split(" ");
	String wordRev="";
	for(String w:strWords)
	{
		String strCharRev="";
		for(int i=w.length()-1;i>=0;i--)
		{
			strCharRev=strCharRev+w.charAt(i);
		}
		wordRev=wordRev+strCharRev+" ";
		
	}
	System.out.println(wordRev);
		
		
	}
	
	}

