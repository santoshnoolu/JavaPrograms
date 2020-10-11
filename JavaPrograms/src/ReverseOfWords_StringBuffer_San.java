
public class ReverseOfWords_StringBuffer_San {
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
		 3. Reverse characters of each word using string buffer
		 4. Join the reversed words
		 */
	
	String strWords[]=strInput.split(" ");
	String wordRev="";
	for(String w:strWords)
	{
		
	StringBuffer sb= new StringBuffer(w);
	sb.reverse();
	 wordRev=wordRev+sb.toString()+" ";
	}
	System.out.println(wordRev);
		
		
	}
	

}
