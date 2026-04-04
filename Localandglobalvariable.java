package Javapractice;

public class Localandglobalvariable {	
	static int c=40;//global variable outside method but inside the class
	  char d='s';	//instance variable // global variable which is non static
	 final int e=80;
	 int f=45;//instance variable // global variable which is non static
	void test()
	{
	int a=15;//local variable
	System.out.println(a);
	a=50;//local variable updated
	System.out.println(a);
	}
	void test1() 
	{
	int b=25;//local variable inside method
	System.out.println(b);
	}
	public static void main(String[] args) {
		Localandglobalvariable a=new Localandglobalvariable();
		a.test();
		a.test1();
		System.out.println(c);
		a.c=52;//global variable updated
		System.out.println(a.c=52);
		System.out.println(a.d);		
		System.out.println(a.e);
		System.out.println(a.f);

	}

}
