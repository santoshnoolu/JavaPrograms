package com.Santosh;
import java.util.HashMap;
import java.util.Map;

public class CountOfRepeatedCharacters {

	public static void main(String[] args) {
		String strinp="Noolu santosh Kumar";
		countOfRepChars(strinp);
	
	}
	public static void countOfRepChars(String strSentence)
	{
		String strinpWoSpaces=strSentence.replace(" ","").toLowerCase();
		HashMap<Character, Integer> map= new HashMap<Character,Integer>();

		for(int i=0;i<strinpWoSpaces.length();i++)
		{		
			if(map.containsKey(strinpWoSpaces.charAt(i)))
			{
				map.put(strinpWoSpaces.charAt(i),map.get(strinpWoSpaces.charAt(i))+1);

			}
			else
				map.put(strinpWoSpaces.charAt(i),1);
		}
		for(Map.Entry<Character,Integer> entry:map.entrySet())
		{
			System.out.println(entry.getKey()+"....."+entry.getValue());
		}
	}
}
