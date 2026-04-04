package Assignments;

public class superkeyword extends methodoverriding{
	void test()
	{
		super.test();
		System.out.println("Test with Invalid Credentials");
	}
	public static void main(String[] args) {
		superkeyword v=new superkeyword();
		v.test();

	}

}
