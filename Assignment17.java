package Assignments;

import java.util.Scanner;

public class Assignment17 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter First Number");
		double a=s.nextDouble();
		System.out.println("Enter Second Number");
		double b=s.nextDouble();
		System.out.println("Enter Third Number");
		double c=s.nextDouble();
		double sum=a+b+c;
		System.out.println("Addition of three numbers is "+sum);
		double sub=a-b;
		System.out.println("Subtraction of two numbers is "+sub);
		double mul=a*b;
		System.out.println("Multiplication of two numbers is "+mul);
		double div=b/a;
		System.out.println("Division of two numbers is "+div);
		s.close();
	}

}
