package arrayPractice;

import java.util.Scanner;

public class Getmin 
{
	public void minimum(int input[])
	{
		int min=input[0];
		
		for(int j=0; j<input.length;j++)
		{
		
			if(input[j]<min)
			{
				min=input[j];
			}
			
		}
		System.out.println(min);
	}
	public static void main(String[] args) 
	{
		Getmin ob=new Getmin();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the 5 input.");
		int input[]=new int[5];
		for(int i=0;i<input.length;i++)
		{
			input[i]=sc.nextInt();
		}
		ob.minimum(input);
		sc.close();
		
	}
}
