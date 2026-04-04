package Javapractice;

public class Constructornew1 {

	public static void test()
	{
		int a=10;
		int b=15;
		if((a<b && a==b))
		{
			System.out.println("If block should execute");
		}
		else
		{
			System.out.println("Else block should execute");
		}
		}
	public static void demo()
	{
		double a=25.2;
		double b=35.3;
		if((a<b || a==b))
		{
			System.out.println("If block should execute First");
		}
		else
		{
			System.out.println("Else block should execute");
		}
	}
	
	void method()
	{
		System.out.println("Iswarya Nagarajan");
	}
	
	
	public static void cons()
	{
		System.out.println("Static method outside the class");
	}
	
	void constr()
	{
		System.out.println("Non Static method outside the class");
	}
	

Constructornew1()
{
	System.out.println("Constructor");
}

}