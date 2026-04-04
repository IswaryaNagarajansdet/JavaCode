package Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class assignment82 {

	public static void main(String[] args) {
	ArrayList<Integer> a1= new ArrayList<Integer> ();
	a1.add(1500);
	a1.add(5874);
	a1.add(2554);
	a1.add(8009);
	a1.add(7865);
	Collections.sort(a1);
	System.out.println("Sorted Array list is--> "+a1);//sorted
	
	 Vector<Double> v1=new Vector<Double>();
	 v1.add(45.36);
	 v1.add(435.56);
	 v1.add(65.06);
	 Collections.sort(v1);
		System.out.println("Sorted vector is--> "+v1);//sorted
	
	Set<Integer> s1= new HashSet<Integer>();
	s1.add(45);
	s1.add(12);
	s1.add(68);
	System.out.println(s1);//cannot sort
	}

}
