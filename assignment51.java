package Assignments;

import java.util.Arrays;

public class assignment51 {
	static int alp=0;
	static int num=0;
	static int space=0;
	static int spechar=0;
	private static boolean b1;
	public static void main(String[] args) {
String input="Testing no 5 !@#$%^";
        
        char []c1=input.toCharArray();
        for(int i=0;i<c1.length;i++)
        {
        boolean b1=                Character.isDigit(c1[i]);
        if(b1==true)
        {
                num++;
        }
        boolean b2=                Character.isAlphabetic(c1[i]);
        if(b2==true)
        {
        	alp++;
        }
        
        boolean b3=                Character.isWhitespace(c1[i]);
        if(b3==true)
        {
                space++;
        }
        }        
        System.out.println("Count of Alphabets is " +alp);
        System.out.println("Count of Number is " +num);
        System.out.println("Count of space is " +space);
       

        spechar=input.length()-(alp+num+space);
        System.out.println("Count of spechar is " + spechar);
        }
}

