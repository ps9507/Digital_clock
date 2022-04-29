package program;

public class Stringformatter {
public static String reverseWord(String str)
{
	String words[]=str.split(" ");
	String reversWord="";
	for(String w:words)
	{
		StringBuilder sb=new StringBuilder(w);
		sb.reverse();
		reversWord+=sb.toString()+" ";
	}
		
	
	return reversWord.trim();
}
public static void main(String[] args) {
	System.out.println(Stringformatter.reverseWord("my name is pradip shinde"));
}
}
