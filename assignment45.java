package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class assignment45 {

	public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter the Size of an array: ");
	int []no1=new int[s1.nextInt()];
	int []no2=new int[no1.length];
	for (int i = 0;i<=no1.length-1;i++)
	{

		System.out.println("Please Enter the value of Array 1:");
		no1[i]=s1.nextInt();
		System.out.println("Please Enter the value of Array 2:");
		no2[i]=s1.nextInt();
	}
		System.out.println(Arrays.toString(no1));
		System.out.println(Arrays.toString(no2));
		if(Arrays.equals(no1, no2))
		{
			System.out.println("The 2 Arrays are Equal");
		}
		else
		{
			System.out.println("The 2 Arrays are not Equal");
		}
		
	}

	}


