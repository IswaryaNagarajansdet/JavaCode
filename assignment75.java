package Assignments;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class assignment75 {

	public static void main(String[] args) {

	Set<String> s1= new HashSet<String> ();
	s1.add("Test1");
	s1.add("auto");
	s1.add("manual");
	
	Iterator<String> i1=s1.iterator();
	while(i1.hasNext())
	{
		System.out.println(i1.next());
	}
	
	

     
	
	}
}
