package Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class assignment98 {

	public static void main(String arg[]) 
	{
		 List<Integer> l = new ArrayList<>();
	        l.add(10);
	        l.add(20);
	        List<Integer> a = Collections.unmodifiableList(l);
	        a.add(30);
	}
}

