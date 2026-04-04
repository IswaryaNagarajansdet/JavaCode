package Assignments;

import java.util.Scanner;

public class Assignment16 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Value of a:");
		int a=s.nextInt();
		int val=a*a;
		System.out.println("The Area of Square is " +val);
		
		System.out.println("Enter Value of a:" );
		int a1=s.nextInt();
		System.out.println("circumferenceofsquare is "+4*a1);
		s.close();
	}

}
