package Assignments;

import java.util.Scanner;

public class Assignment14 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value of b:");
		float b=s.nextFloat();
		System.out.println("Enter value of h:");
		float h=s.nextFloat();
		double value=0.5*b*h;
		System.out.println("Area of Triangle: "+value);
		
		System.out.println("Enter the value of a:");
		long a= s.nextLong();
		System.out.println("Enter the value of b:");
		long b1= s.nextLong();
		System.out.println("Enter the value of c:");
		long c=s.nextLong();
		long val=a+b1+c;
		System.out.println("circumference of triangle is "+val);
		s.close();

	}

}
