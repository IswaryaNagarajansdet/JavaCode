package Assignments;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class assignment97 {

	public static void main(String arg[]) throws MalformedURLException 
	{
		//URL l =new URL("www.testing.com");//checked exception
		{
		//	System.out.println(l);
		}
		
		Scanner s1=new Scanner(System.in);
		{
			System.out.println("Enter the value :");//unchecked exception
			System.out.println(s1.nextInt());
		}
	}

}
