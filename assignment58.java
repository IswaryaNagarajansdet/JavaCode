package Assignments;

import java.util.Arrays;

public class assignment58 {

	public static void main(String[] args) {
	String a="automation";
	System.out.println(a.toUpperCase()); //uppercase
	String b="TESTING";
	System.out.println(b.toLowerCase());//lowercase
	String a1="Testi";
	String [] s1=a1.split(""); //split
	//System.out.println(Arrays.toString(s1));
	String newvalue=s1[4].concat(s1[3]).concat(s1[2]).concat(s1[1]).concat(s1[0]);//concat
	System.out.println(newvalue);
	
	}

}
