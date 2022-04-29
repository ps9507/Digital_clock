 package program;

public class MixString {
public static void main(String[] args) {
	String str="my D1ate of Birth is 19/07/1995";
	char ch[]=str.toCharArray();
	int letters=0 , spaces=0, number=0,other=0;
	for(int i=0;i<str.length();i++)
	{
		if(Character.isLetter(ch[i]))
		{
			letters++;
		}
		else if(Character.isSpace(ch[i]))
		{
			spaces++;
		}
		else if(Character.isDigit(ch[i]))
		{
			number++;

		}
		else
		{
			other++;
		}
	}
	System.out.println("Count the number"+" "+number);
	System.out.println("Count the letters"+" "+letters);
	System.out.println("Count the spaces"+" "+spaces);
	System.out.println("Count the other"+" "+other);


	

}
}
