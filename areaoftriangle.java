package Javapractice;

import java.util.Scanner;

public class areaoftriangle {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter value of b:");
	float b=s.nextFloat();
	System.out.println("Enter value of h:");
	float h=s.nextFloat();
	double value=0.5*b*h;
	System.out.println("Area of Triangle: "+value);
	s.close();
	}

}
