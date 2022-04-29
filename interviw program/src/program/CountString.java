 package program;

public class CountString {
public static void main(String[] args) {
	String str="pra1dip sh34inde";
	char ch[]=str.toCharArray();
	int count=0,Letters=0,space=0,number=0;

	System.out.println("Length of total String"+"  " +str.length());
	for(int i=0;i<str.length();i++)
	{
		if(Character.isLetter(ch[i]))
		{
			Letters++;
		}
		else if(Character.isSpace(ch[i]))
		{
			space++;
		}
		if(Character.isDigit(ch[i]))
		{
			number++;
		}
	}
	System.out.println("Count of space"+" "+space);
	System.out.println("Count of Letters "+" "+Letters);
	System.out.println("Count of number"+" "+number);

}
}
