package com.Santosh;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {

	public static void main(String s[])
	{
		String strinp = "Welcome to Java";
		findFirstNonRepChar(strinp);
	}
	public static void findFirstNonRepChar(String strinp)
	{
		Character chNonRepChar = null;
		boolean flag=false;
		LinkedHashMap<Character, Integer> map= new LinkedHashMap<Character, Integer>();
		String strinpWoSpaces=strinp.replaceAll(" ","").toLowerCase();
		for(int i=0;i<strinpWoSpaces.length();i++)
		{
			if(map.containsKey(strinpWoSpaces.charAt(i)))
			{
				map.put(strinpWoSpaces.charAt(i),map.get(strinpWoSpaces.charAt(i))+1);
			}
			else
			{
				map.put(strinpWoSpaces.charAt(i),1);
			}
		}
		for(Map.Entry<Character, Integer> entry:map.entrySet())
		{
			if(entry.getValue()==1)
			{
				chNonRepChar=entry.getKey();
				flag=true;
				break;
			}
			else
			{
				flag=false;
			}
		}
		if(flag)
		{
			System.out.println("The first non repeated character in the given string is "+chNonRepChar);
		}
		else
		{
			System.out.println("There are no non repeated chasracters in the string");
		}
	}
}
