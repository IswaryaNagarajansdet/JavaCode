package Assignments;

public class assignment24 {

	
	assignment24(String s)
	{
		System.out.println("Constructor 4");
	}
	assignment24(int a)
	{
		super();
		System.out.println("Constructor 3");
	}
	assignment24(int a,double b)
	{
		super();
		System.out.println("Constructor 2");
	}
	assignment24()
	{
		super();
		System.out.println("Constructor 1");
	}
	public static void main(String[] args) {
		new assignment24();
		new assignment24(100);
		new assignment24(42,15.20);
		new assignment24("Iswarya");
	}

}
