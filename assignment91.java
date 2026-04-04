package Assignments;

public class assignment91 {

	public static void main(String[] args) {
	 try
	 {
		int a=1;
		int b=0;
		int c=a/b;
	 System.out.println(c);
	 }
	 catch(ArithmeticException e)//Arithmetic exception
	 {
		 System.out.println("Catch executed ---> Exception Handled");
	 }

	 try
	 {
	 int a[]=new int[2];//ArrayIndexOutOfBoundsException
	 a[0]=1;
	 a[1]=4;
	 a[2]=7;
	
	 }
	 catch(ArrayIndexOutOfBoundsException a1)
	 {
		 System.out.println("Catch executed ---> Exception Handled for Array index");
	 }
	 finally
	 {
		 System.out.println("Finally executed --->Closing the program");
	 }
	 }


	}


