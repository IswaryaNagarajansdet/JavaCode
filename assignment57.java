package Assignments;

import java.util.Arrays;

public class assignment57 {

	public static void main(String[] args) {
	String a="ten";
	String b="net";	
	if(a.length()!=b.length())
	{
		System.out.println("They cannot be Anagram");
	}
	else
	{
		char[] c1=a.toCharArray();
		char[] c2=b.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));
		if(Arrays.equals(c1, c2))
		{
			System.out.println("Two arrays are Equal");
		}
		else
		{
			System.out.println("Two arrays are not Equal");
		}
	}

	}

}
