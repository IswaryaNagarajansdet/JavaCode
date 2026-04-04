package Assignments;

import java.util.ArrayList;

public class assignment65 {

	public static void main(String[] args) {
	ArrayList <Integer> a1=new ArrayList <Integer>();
	a1.add(15);
	a1.add(20);
	a1.add(25);
	a1.add(45);
	System.out.println("Values in a1 " +a1);	
	
	ArrayList <Integer> a2=new ArrayList <Integer>();
	a2.add(111);
	a2.addAll(a1);
	System.out.println("Values in a2 " +a2);	
	boolean b1=a1.contains(25);
	System.out.println(b1);
	boolean b2 = a2.containsAll(a1);
	System.out.println(b2);
			
	}

}
