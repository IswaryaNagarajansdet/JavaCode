package Assignments;

import java.util.Arrays;

public class assignment53 {
	static int alp=0;
	static int num=0;
	static int space=0;
	static int spechar=0;
	private static boolean b1;
	public static void main(String[] args) {
		String input="C String ";
        
        char []c1=input.toCharArray();
        for(int i=0;i<c1.length;i++)
        {
        boolean v1=                Character.isWhitespace(c1[i]);
        if(v1==true)
        {
                space++;
        }
        }        
        System.out.println("Count of space is " +space);
        }
}

