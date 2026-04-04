package Assignments;

import java.util.HashMap;
import java.util.Map;

public class assignment84 {

	public static void main(String[] args) {
		Map  <Integer,String> m1 =new HashMap <Integer,String> ();
		m1.put(4512,"Iswarya");
		m1.put(4502,"Sai");
		m1.put(9212,"Bala");
		m1.put(5812,"Ram");//put
		System.out.println(m1);
		m1.put(4789, "Test");
		m1.putIfAbsent(6895, "Testing");//putifAbsent
		Map  <Integer,String> m2 =new HashMap <Integer,String> ();
		m2.put(8989, "Raj");
		m2.putAll(m1);//putall
		System.out.println(m2);
		System.out.println(m1.containsKey(4502));//contains key
		System.out.println(m1);
		System.out.println(m1.containsValue("Bala"));//contains value
		System.out.println(m1.equals(m2));//equal
		System.out.println(m1);
		System.out.println(m1.remove(9212));//remove K
		System.out.println(m1);
		System.out.println(m1.remove(4512, "Iswarya"));//remove KV
		System.out.println(m1);
		System.out.println("Size is " +m2.size());//size
		System.out.println(m1);		
		System.out.println(m1.replace(4502, "Devi"));//replace
		System.out.println(m1.replace(5812, "Ram", "Prataj"));//replace (k,old,new)
		System.out.println(m1);
		m1.putAll(m2);//putall
		System.out.println(m2);
		System.out.println(m1.get(6895));//get
	}

}
