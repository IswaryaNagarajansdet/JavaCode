package Assignments;

public class assignment42 {

	public static void main(String[] args) {
	String input ="sis";
	String output ="";
	for(int i=input.length()-1;i>=0;i--)
	{
	char c1= input.charAt(i);
	output=output+c1;
	}
	System.out.println("Input="+input);
	System.out.println("Output="+output);
	if(input.equals(output))
	{
		System.out.println("String is Palindrome");
	}
	else
	{
		System.out.println("String is Not a Palindrome");
	}
	}
}
