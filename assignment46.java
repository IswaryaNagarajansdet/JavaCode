package Assignments;

public class assignment46 {

	public static void main(String[] args) {
 
		
		int[] input =new int[4];
		input[0]=21;
		input[1]=45;
		input[2]=54;
		input[3]=67;
		
		int noTocheck=54;
		for(int i=0;i<input.length;i++)
		{
			if(noTocheck==input[i])
			{
				System.out.println("Yes number is present");
			}
			else
			{
				System.out.println("Yes number is not present");
			}
		}
	}

}
