package Assignments;

public class Assignment22 {
	
		double b=40.4;//global variable
		final float c=32.55f;//final variable
		static void test()//static method
		{
			int a=10;//local variable
			System.out.println("Initial value of local variable is "+a);
			a=15;//local variable updated
			System.out.println("Updated value of Local variable is "+a);
		}
		void testing()//non static method
		{
			char c='d';
			System.out.println("Non Static method");
		}
		public static void main(String[] args) {
			test();
			Assignment22 a=new Assignment22();
			a.testing();
			System.out.println(a.b=45.5);//global variable updated
	
	}

}