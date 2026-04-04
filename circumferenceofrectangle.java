package Javapractice;

import java.util.Scanner;

public class circumferenceofrectangle {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter value of a:");
	int a=s.nextInt();
	System.out.println("Enter value of b:");
	int b=s.nextInt();
	int val=(a+b);
	System.out.println("Circumference of rectangle is "+2*val);
}
}
