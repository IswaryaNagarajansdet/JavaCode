package Javapractice;

public class constructorthis {
	constructorthis()
	{
		System.out.println("Cons 1");
	}
	
	constructorthis(int a)
	{
		this();
	
		System.out.println("Cons 2");
	}
	constructorthis(double b)
	{
		this();
		System.out.println("Cons 3");
	}
	public static void main(String[] args) {
	
		new constructorthis();
		new constructorthis(15.8);
		new constructorthis(11);
		
		
	}

}
