package Assignments;

public class Assignment5 {
	
	public static void test()//static method 1
	{
		int a=15;
		int b=17;
		if(a<b) {
			
			System.out.println("Static method 1");
		}
	}
	public static void test1()//static method 2
	{
		int a=17;
		int b=17;
		if(a>=b) {
			
			System.out.println("Static method 2");
		}
	}
	public static void main(String[] args) {
	
		System.out.println("Calling static method inside Main method");
		test();//Static method
		test1();//Static method
}
}
