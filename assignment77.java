package Assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

public class assignment77 {

	public static void main(String[] args) {

	 Vector<Double> v1=new Vector<Double>();
	 v1.add(45.36);
	 v1.add(1, 89.69);
	 v1.addFirst(78.96);
	 v1.addLast(99.15);
	 v1.contains(45.36);
	 System.out.println(v1);
	 Vector<Double> v2=new Vector<Double>();
	 v2.add(66.336);
	 System.out.println(v2);
	 v2.containsAll(v1);
	 System.out.println(v1.isEmpty());
	v2.clear();
	 System.out.println(v1);
	System.out.println(v1.equals(v2));
	System.out.println(v1.get(2));
	
	
	}
}
