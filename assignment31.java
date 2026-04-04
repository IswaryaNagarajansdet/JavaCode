package Assignments;

public class assignment31 {
public void test()
{
	System.out.println("Public Access Specifier");
}
private void test1()
{
	System.out.println("Private Access Specifier");
}
protected void test2()
{
	System.out.println("Protected Access Specifier");
}
void test3()
{
	System.out.println("Default Access Specifier");
}
	public static void main(String[] args) {
		assignment31 a=new assignment31();
		a.test();
		a.test1();
		a.test2();
		a.test3();

	}

}
