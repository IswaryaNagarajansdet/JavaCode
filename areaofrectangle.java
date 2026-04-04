package Javapractice;

import java.util.Scanner;

public class areaofrectangle {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Please Enter value of a:");
		int a=s.nextInt();
		System.out.println("Please Enter value of b:");
		int b=s.nextInt();
		int mul=a*b;
		System.out.println("The area of Triangle is:" +mul);
		s.close();

	}

}
