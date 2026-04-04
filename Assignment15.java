package Assignments;

import java.util.Scanner;

public class Assignment15 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Please Enter value of a:");
		int a=s.nextInt();
		System.out.println("Please Enter value of b:");
		int b=s.nextInt();
		int mul=a*b;
		System.out.println("The area of Triangle is:" +mul);
		
		System.out.println("Enter value of a:");
		int a1=s.nextInt();
		System.out.println("Enter value of b:");
		int b1=s.nextInt();
		int val=(a1+b1);
		System.out.println("Circumference of rectangle is "+2*val);
		s.close();

	}

}
