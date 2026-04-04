package Assignments;

import java.util.ArrayList;

public class assignment67 {

	public static void main(String[] args) {
			ArrayList <Integer> a1=new ArrayList <Integer>();
			a1.add(15);
			a1.add(20);
			a1.add(25);
			a1.add(45);
			System.out.println("Values in a1 " +a1);	
			a1.add(96);// Adding more elements dynamically
			a1.add(89);
			System.out.println("Values in a1 " +a1);	
			
		a1.remove(2); //removing elements dynamically
		System.out.println("Values in a1 " +a1);
	}

}
