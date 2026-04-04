package Assignments;


import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class assignment76 {

	public static void main(String[] args) {

	 Vector<Double> v1=new Vector<Double>();
	 v1.addElement(46.99);
	 v1.addElement(59.886);
	 v1.addElement(932.7810);
	 System.out.println("Before Enumeration " +v1);
	 Enumeration<Double> v2=v1.elements();
	 while(v2.hasMoreElements())
	 {
		 System.out.println("After Enumeration " +v2.nextElement());
	 }
	 

     Iterator<Double> i1=  v1.iterator();
     while(i1.hasNext())
     {
             System.out.println("Iteration is " +i1.next());
     }
     
    // ListIterator<Double> l1= v1.listIterator();
     
     //while(l1.hasNext())
    // {
    	// System.out.println("ListIteration is " +l1.hasNext());
   //  }
     
     
	
	}
}
