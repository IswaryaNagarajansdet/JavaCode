package Assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class assignment70 {

	public static void main(String[] args) {

	ArrayList<Integer> a1= new ArrayList<Integer>();
	a1.add(9687);
	a1.add(1452);
	a1.add(8966);
	a1.add(4123);

	System.out.println(a1);
	
	Iterator<Integer> i2= a1.iterator();
	while(i2.hasNext())
	{
		System.out.println("Iterating the Elements " +i2.next());
	}
	
	ListIterator<Integer> i3= a1.listIterator();
	while(i3.hasNext())
	{
		System.out.println("Forward Iteration is " +i3.next());
	}
     
	
	}
}
