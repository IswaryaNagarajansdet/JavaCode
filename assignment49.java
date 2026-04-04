package Assignments;

import java.util.Arrays;

public class assignment49 {

	private static final int j = 0;

	public static void main(String[] args) {
		
		int a[] =new int[3];
		a[0]=15;
		a[1]=45;
		a[2]=75;
		int b[]=new int[a.length];
		int j;
		for(int i=0,j1=a.length-1;i<a.length;i++,j1--)
		{
			b[j1]=a[i];
		}
		System.out.print("Input Array is ");
		System.out.println(Arrays.toString(a));
		System.out.print("Output Array is ");
		System.out.println(Arrays.toString(b));
	}

}
