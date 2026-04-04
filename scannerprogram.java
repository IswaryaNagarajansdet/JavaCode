package Javapractice;

import java.util.Scanner;

public class scannerprogram {

	public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);
	String input =s1.next();
	double d=s1.nextDouble();
	byte b=s1.nextByte();
	float f=s1.nextFloat();
	int a=s1.nextInt();
	short s=s1.nextShort();
	long l=s1.nextLong();
	boolean e=s1.nextBoolean();
	s1.close();
	}

}
