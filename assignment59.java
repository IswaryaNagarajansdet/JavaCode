package Assignments;

public class assignment59 {

	public static void main(String[] args) {
		StringBuffer b1 =new StringBuffer("Testing");
		b1.reverse();
		System.out.println(b1);
		System.out.println(b1.substring(2));
		System.out.println(b1.substring(0, 3));
		
		StringBuffer c1=new StringBuffer("Having Tea");
		c1.insert(7, "Cup of ");
		System.out.println(c1);

	}

}
