package Javapractice;

public class Staticmethodinsideclass {
	
	
	
	static void add()
	{
		int a=5;
		int b=6;
		int total=a+b;
		System.out.println(total);
	}
	
	static void sub()
	{
		int a=5;
		int b=6;
		int minus=b-a;
		System.out.println(minus);
	}
	static void demo()
	{
		int a=45;
		int b=6;
		if(a==b)
		{
		System.out.println("Equal");
		}
		else
		{
		System.out.println("Not Equal");
		}
	}
	
	static void mult()
	{
		int a=5;
		int b=6;
		int mult=b*a;
		System.out.println(mult);
	
	}

	static void mod()
	{
		int a=15;
		int b=25;
		int mod=b%a;
		System.out.println(mod);
	
	}
	
	static void test()
	{
		String a="Iswarya";
		String b="test";
		System.out.println(a+b);
		
	}
	

	public static void main(String[] args) {
		add();
		sub();
		mult();
	    mod();
	    test();
	    demo();
		
	}

}
