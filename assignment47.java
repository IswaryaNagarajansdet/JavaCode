package Assignments;

public class assignment47 {

	public static void main(String[] args) {
	 double input[]=new double[5];
	 input[0]=10.6;
	 input[1]=58.4;
	 input[2]=17.3;
	 input[3]=24.98;
	 input[4]=40.446;
	 
	 double sum=0;
	 for(int i=0;i<input.length;i++)
	 {
		 sum=sum+input[i];
	 }
	 
	 double average = sum/input.length;
	 
	 System.out.println("Average value is " +average);
	 
	}

}
