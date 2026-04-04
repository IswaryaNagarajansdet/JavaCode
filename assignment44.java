package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class assignment44 {

	public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter the Size of an array: ");
	int [] no=new int[s1.nextInt()];
	for(int i = 0;i<=no.length-1;i++)
	{
		System.out.println("Please Enter the value at index:");
		no[i]=s1.nextInt();
		System.out.println(Arrays.toString(no));
		
		
	}

	}

}
