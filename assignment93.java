package Assignments;

import java.util.Scanner;

public class assignment93 
{

	public static void main(String[] args) {
		
		{
		Scanner s1=new Scanner(System.in);
		System.out.println("Please enter Size of Array-> ");
		  int a[]=new int[s1.nextInt()];
		
		//catch(InputMismatchException i)
		{
			System.out.println("Catch executed for Exception 1");
		}
		//catch(NegativeArraySizeException n)
		{
			System.out.println("Catch executed for Exception 2 ");
		}
		//finally
		{
			System.out.println("Finally also executed");
		}
		
	}
	}
}

