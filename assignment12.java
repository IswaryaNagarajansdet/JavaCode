package Assignments;

import java.util.Scanner;

public class assignment12 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Please Enter value of a:");
		int a=s.nextInt();
		System.out.println("Please Enter value of b:");
		int b=s.nextInt();
		int add=a+b;
		System.out.println("Addition of two numbers:" +add);
		s.close();

	}

}
