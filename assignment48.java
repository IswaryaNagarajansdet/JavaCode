package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class assignment48 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the Size of an array: ");
		int []no1=new int[s1.nextInt()];
		int []copied=new int[no1.length];
		for (int i = 0;i<=no1.length-1;i++)
		{

			System.out.println("Please Enter the value of Array :");
			no1[i]=s1.nextInt();
			copied[i]=no1[i];
		}
		    System.out.println("Input Array is");
			System.out.println(Arrays.toString(no1));
			System.out.println("Output Array is");
			System.out.println(Arrays.toString(copied));
			

	}

}
