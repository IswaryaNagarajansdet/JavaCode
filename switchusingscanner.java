package Assignments;
import java.util.Scanner;
public class switchusingscanner {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);	 	 	
		   System.out.println("Enter your value");
		   int value=s.nextInt();	 
		   System.out.println("Choose the First number");
		   int a=s.nextInt();
		   System.out.println("Choose the second number");
		   int b=s.nextInt();
		   switch(value) 
		   {
	       case 1: 
	    	   System.out.println("Addition of two numbers is " +(a+b));
	    	   break;	        
	       case 2:   
	    	   System.out.println("Sub of two numbers is " + (a-b));
	    	   break;	       
	       case 3: 
	    	   System.out.println("Mult of two numbers is " +(a*b));
	    	   break;   
	       case 4:
	    	   System.out.println("Divide of two numbers is " +(b/a));
	    	   break;	       
	      default: 
	    	  System.out.println("Nothing");
	    	  s.close();
	}

}
}
