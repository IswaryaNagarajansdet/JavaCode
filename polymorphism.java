package Assignments;

public class polymorphism extends assignment94 {
	void test()
	{
		System.out.println("Login with Number");
	}
	public static void main(String[] args) {
		int a=20;int b=15;
		if(a>b)
		{
			polymorphism p =new polymorphism();
			p.test();
		}
		else
		{
			assignment94 c=new assignment94();
			c.test();
		}
	}

}
