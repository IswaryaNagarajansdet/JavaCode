package Assignments;

import java.util.Scanner;

public class Assignment13 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		double d=Math.PI;
		int r=8;
		System.out.println("The area of circe is " +d*r*r);
		
		System.out.println("Enter value of r: ");
		int i=s.nextInt();
		double b=2*Math.PI;
		System.out.println("circumference of circle is " +b*i);

	}

}
