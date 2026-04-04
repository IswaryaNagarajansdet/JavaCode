package Assignments;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class assignment85 {

	public static void main(String[] args) {
		Map  <Integer,String> m1 =new HashMap <Integer,String> ();
	m1.put(1001, "First");
	m1.put(1002, "Second");
	m1.put(1003, "Third");
	m1.put(1004, "Fourth");
	System.out.println(m1);
	Set <Integer> i1=m1.keySet();
	System.out.println("Iterating the Key");
	for(Integer i2: m1.keySet())//iterating the key
	{
		System.out.println(i2);
	}
	
	Collection <String> m2=m1.values();//iterating the value
	System.out.println("Iterating the Value");
	for(String s1:m1.values())
	{
		System.out.println(s1);
	}
	

}
}