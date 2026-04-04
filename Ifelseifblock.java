package Javapractice;

public class Ifelseifblock {

	public static void main(String[] args) {
	
		
		int age=20;
		
		if(age>60) 
		{
			System.out.println("Senior citizen");
			if(age>=25)
			{
				System.out.println("Free Book Ticket in Train");
			}
			else
			{
				System.out.println("No free Ticket in Train");
			}
		}
		
		
		else
		{
			System.out.println("Not a Senior Citizen");
		}
	
		}
	
	}


