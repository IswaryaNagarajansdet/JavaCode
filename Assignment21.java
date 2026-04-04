package Assignments;

import java.util.Scanner;

public class Assignment21 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=10,b=15,value=a+b;	 	
		 System.out.println("Enter First number is ");
		 a=s.nextInt();	
		 System.out.println("Enter Second number is ");
		 b=s.nextInt();
		 System.out.println("The sum of two numbers is "+value);
		 s.close();
	}

}
