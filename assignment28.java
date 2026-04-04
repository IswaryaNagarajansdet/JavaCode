package Assignments;

public class assignment28 implements testinginterface{
	
	
	void news()
	{
		System.out.println("Calling non static method");
	}
	public static void main(String[] args) {
	
		System.out.println("Testing");
		assignment28 v=new assignment28();
		v.news();
		}

}
