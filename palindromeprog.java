package Javapractice;

public class palindromeprog {

	public static void main(String[] args) {
		String input="testing";
		String output="";
		for(int i=input.length()-1;i>=0;i--)
		{
			char a=input.charAt(i);
			output=output+a;
		}

		System.out.println("Input is " +input);
		System.out.println("Output is " +output);
	}

}
