package Assignments;

import java.util.ArrayList;

public class assignment60 {

	public static void main(String[] args) {
	ArrayList <Integer> a1=new ArrayList <Integer>();
	a1.add(15);
	a1.add(20);
	a1.add(25);
	a1.add(3, 2);
	System.out.println(a1);
	ArrayList <Integer> a2=new ArrayList <Integer>();
	a2.add(30);
	a2.addAll(a1);
	System.out.println(a2);
	}

}
