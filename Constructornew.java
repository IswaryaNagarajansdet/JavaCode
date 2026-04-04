package Javapractice;

public class Constructornew {
	
	Constructornew()
	{
		System.out.println("Constructor Program");
	}
	

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=a*b;
		System.out.println(c);
		new Constructornew();
		Constructornew1 n= new Constructornew1();
		n.test();
		Constructornew1 s=new Constructornew1();
		s.demo();
		Constructornew1 q=new Constructornew1();
        q.method();
        Constructornew1.cons();
        Constructornew1 v=new Constructornew1();
        v.constr();
        new Constructornew1();

}
}