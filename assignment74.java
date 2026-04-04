package Assignments;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class assignment74 {

	public static void main(String[] args) {

	Set<Integer> s1= new HashSet<Integer> ();
	s1.add(45);
	s1.add(16);
	s1.add(100);
	s1.add(83);
	
	Iterator<Integer> i1=s1.iterator();
	while(i1.hasNext())
	{
		System.out.println(i1.next());
	}
	
	

     
	
	}
}
