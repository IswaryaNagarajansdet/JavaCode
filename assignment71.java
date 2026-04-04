package Assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class assignment71 {

	public static void main(String[] args) {

	ArrayList<Integer> a1= new ArrayList<Integer>();
	a1.add(12);
	a1.add(58);
	a1.add(774);
	a1.add(254);
	a1.add(1477);
	System.out.println(a1);
	
	Iterator<Integer> i2= (Iterator<Integer>) a1.iterator();
	while(i2.hasNext())
	{
		System.out.println("Iterating the Elements " +i2.next());
	}
	
	ListIterator<Integer> i3= a1.listIterator();
	while(i3.hasNext())
	{
		System.out.println("Forward Iteration is " +i3.next());
	}
	while(i3.hasPrevious())
	{
		System.out.println("Backward Iteration is " +i3.previous());
	}
     
	
	}
}
