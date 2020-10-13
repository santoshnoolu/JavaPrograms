package com.Santosh;

import java.util.HashMap;
import java.util.Map;

public class Vowels_Consonants_Count {

	public static void main(String args[])
	{
		String strinp="Welcome to Java";
		countVowCon(strinp);
		printVowCons(strinp);
	}
	public static void countVowCon(String strinp)
	{
		int vowCount=0;
		int conCount=0;
		String strinpWoSpaces=strinp.replaceAll(" ","");
		for(int i=0;i<strinpWoSpaces.length();i++)
		{
			char ch=strinpWoSpaces.charAt(i);
			if(ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
			{
				vowCount++;
			}
			else
			{
				conCount++;
			}
		}
		System.out.println("Vowels count is :"+ vowCount);
		System.out.println("Consonants count is :"+ conCount);
	}
	public static void printVowCons(String strinp)
	{
		String strinpWoSpaces=strinp.replaceAll(" ","");
		HashMap<Character,Integer> mapVow= new HashMap<Character,Integer>();
		HashMap<Character,Integer> mapCon= new HashMap<Character,Integer>();
		for(int i=0;i<strinpWoSpaces.length();i++)
		{
			char ch=strinpWoSpaces.charAt(i);
			if(ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
			{
				mapVow.put(ch, 1);
			}
			else
			{
				mapCon.put(ch,1);
			}
		}
		System.out.println("Vowels are: ");
		for(Map.Entry<Character,Integer> entry:mapVow.entrySet())
		{
			System.out.print(entry.getKey()+" ");	
		}
		System.out.println();
		System.out.println("Consonants are: ");
		for(Map.Entry<Character,Integer> entry:mapCon.entrySet())
		{
			System.out.print(entry.getKey()+" ");	
		}
			
	}
	
}
