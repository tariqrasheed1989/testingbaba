package arrayPractice;

import java.util.Scanner;

public class SecondMax 
{
	public void getSecondMax(int input[])
	{
		int max=0;
		int secondmax=0;
		for(int i=0;i<input.length;i++)
		{
			if(input[i]>max)
			{
				secondmax=max;
				max=input[i];
			}
		}
		System.out.println(secondmax);
	}
	public static void main(String[] args) 
	{
		SecondMax ob=new SecondMax();
		Scanner sc=new Scanner(System.in);
		int input[]=new int[5];
		System.out.println("Please enter the 5 numbers.");
		for(int a=0;a<5;a++)
		{
			input[a]=sc.nextInt();
		}
		ob.getSecondMax(input);
		sc.close();
	}
}
