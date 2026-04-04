package Assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class assignment73 {

	public static void main(String[] args) {

	ArrayList<String> a1= new ArrayList<String>();
	a1.add("One");
	a1.add("Two");
	a1.add("Three");
	a1.add("Four");
	a1.add("Five");
	System.out.println(a1);
	
	Iterator<String> i2= a1.iterator();
	while(i2.hasNext())
	{
		System.out.println("Iterating the Elements " +i2.next());
	}
	
	ListIterator<String> i3= a1.listIterator();
	while(i3.hasNext())
	{
		System.out.println("Forward Iteration is " +i3.next());
	}
     
	
	}
}
