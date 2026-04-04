package Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class assignment99 {

	
	void test()
	{
		System.out.println("Method 1");
	}
	static void test1(int a)
	{
		System.out.println("Method 2");
	}
	void test(double d)
	{
		System.out.println("Method 3");
	}
	void test(String s)
	{
		System.out.println("Method 4");
	}
	static void test1(char f)
	{
		System.out.println("Method 5");
	}
	public static void main(String arg[]) 
	{
		assignment99 v =new assignment99();
		v.test();
		v.test("Iswarya");
		v.test(225.6);
		v.test1(150);
		v.test1('s');
	}
}

