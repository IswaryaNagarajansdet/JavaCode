package Assignments;

import java.util.Arrays;

public class assignment52 {
	static int alp=0;
	static int num=0;
	static int space=0;
	static int spechar=0;
	static int dig;
	private static boolean b1;
	public static void main(String[] args) {
		String input="CString";
        
        char []c1=input.toCharArray();
        for(int i=0;i<c1.length;i++)
        {
        boolean v1=                Character.isDigit(c1[i]);
        if(v1==true)
        {
                dig++;
        }
        }    
        dig=input.length()-(alp+num+space+spechar);
        System.out.println("Count of digits is " +dig);
        }
}

