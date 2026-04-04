package Assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

public class assignment78 {

	public static void main(String[] args) {
	ArrayList<Integer> a1= new ArrayList<Integer> ();
	a1.add(1500);
	a1.add(5874);
	a1.add(2554);
	a1.add(8009);
	a1.add(7865);
	System.out.println(a1);//followed index
	
	 Vector<Double> v1=new Vector<Double>();
	 v1.add(45.36);
	 v1.add(435.56);
	 v1.add(65.06);
	 v1.add(45.78);
	System.out.println(v1);//followed index
	
	Set<String> s1= new HashSet<String>();
	s1.add("Test");
	s1.add("Manual");
	s1.add("Auto");
	System.out.println(s1);//not followed index
	}

}
