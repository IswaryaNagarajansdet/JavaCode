package Javapractice;

public class constructoroverloading {

	constructoroverloading()
	{
	
		System.out.println("Default Constructor");
	}

	constructoroverloading(int a,double b)
	{
		System.out.println("Constructor 1");
		
	}

	constructoroverloading(int a)
	{
		System.out.println("Constructor 2");
		
	}
	constructoroverloading(String s,char c)
	{
		System.out.println("Constructor 3");
		
	}
	constructoroverloading(char a)
	{
		System.out.println("Constructor 4");
		
	}

	constructoroverloading(boolean s)
	{
		System.out.println("Constructor 5");
		
	}
	constructoroverloading(float f,boolean s)
	{
		System.out.println("Constructor 6");
		
	}
	
	public static void main(String[] args) {
		
		new constructoroverloading();
		new constructoroverloading(100,20.2);
		new constructoroverloading(15);
		new constructoroverloading("Iswarya",'s');
		new constructoroverloading('p');
		new constructoroverloading(true);
		new constructoroverloading(5.25f,false);
		
		

	}

}
