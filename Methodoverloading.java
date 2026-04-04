package Javapractice;

public class Methodoverloading {	
	static void test(int a)
	{
		System.out.println("Default Method");
	}
	void test1(int b, double c)
	{
		System.out.println("Method 1");
	}
	void test3(char r, int b) {
		System.out.println("Method 3");
	}
	static void test4() {
		System.out.println("Method 4");
	}
	public static void test2(String a, char c)
	{
		System.out.println("Method 2");
	}
	public static void main(String[] args) {
		test(50);
		Methodoverloading a=new Methodoverloading();
		a.test1(60, 32.5);	
		test2("Iswarya",'d');
		a.test3('w', 25);
		test4();
	}

}
