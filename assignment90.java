package Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class assignment90 {

	public static void main(String[] args) {
		
		List<Integer> l1=new ArrayList<Integer> ();
		l1.add(100);
		l1.add(115);
		l1.add(65);
		l1.add(84);
		l1.add(84);
		l1.add(41);
		l1.add(36);
		Collections.sort(l1);
		System.out.println("Sorted Listed is "+l1);
		Collections.reverse(l1);
		System.out.println("Reversed Listed is "+l1);
		System.out.println("Maximum number is " +Collections.max(l1));
		System.out.println("Minimum number is " +Collections.min(l1));
		System.out.println("Frequency is " +Collections.frequency(l1, 84));
				

	}

}
