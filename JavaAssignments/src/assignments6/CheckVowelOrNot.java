package assignments6;
class CheckVowelOrNot
{
	public static void main(String args[])
	{
	char ch='P';
	if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
	{
	System.out.println(ch+" is a vowel");
	}
	else if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' )
	{
	System.out.println(ch+" is a Vowel");
	}
	else
	{
	System.out.println(ch+" is not a Vowel");	
	}
	}
}