package Assignments;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class assignment86 {

	public static void main(String[] args) {
		Map  <Integer,String> m1 =new HashMap <Integer,String> ();
	m1.put(1001, "First");
	m1.put(1002, "Second");
	m1.put(1003, "Third");
	m1.put(1004, "Fourth");
	System.out.println(m1);
     Set<Entry<Integer,String>> m3=  m1.entrySet();
     System.out.println(m3);
    // Iterator<Entry<Integer,String>> a=m3.iterator();

    //while(a.hasNext())
     {
    //         System.out.println(a.next());
     }
	}

}
