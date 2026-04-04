package Assignments;

public class assignmentthis {
	assignmentthis(int a,double d)
	{
		
		System.out.println("Test2");
	}
	assignmentthis(char c)
	{
		this();
		System.out.println("Test4");
	}
	assignmentthis(int s)
	{
		this();
		System.out.println("Test3");
	}
	assignmentthis()
	{
		System.out.println("Test1");
	}
	public static void main(String[] args) {
	
      new assignmentthis();
      new assignmentthis(20,15.2);
      new assignmentthis('v');
      new assignmentthis(25);
      
	}

}
