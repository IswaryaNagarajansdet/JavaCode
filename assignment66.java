package Assignments;

import java.util.ArrayList;

public class assignment66 {

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
			a2.remove(1);
			System.out.println("Removed index 1" +a2);
			a2.remove(a1);
			System.out.println("Removed Object" +a1);
			a2.removeAll(a2);
			System.out.println(a2);

	}

}
