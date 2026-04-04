package Javapractice;

import java.util.Scanner;

public class circumferenceoftriangle {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the value of a:");
	long a= s.nextLong();
	System.out.println("Enter the value of b:");
	long b= s.nextLong();
	System.out.println("Enter the value of c:");
	long c=s.nextLong();
	long val=a+b+c;
	System.out.println("circumference of triangle is "+val);
	s.close();
}

}
