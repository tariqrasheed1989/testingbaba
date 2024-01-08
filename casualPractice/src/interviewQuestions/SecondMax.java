package interviewQuestions;

import java.util.Scanner;

public class SecondMax 
{
	public static void max(int a[])
	{
		int max=0;
		int secondmax=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				secondmax=max;
				max=a[i];
				
			}
		}
		System.out.println(secondmax);
		System.out.println(max);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter 5 digits.");
		int a[]=new int[5];
		for(int i=0;i<a.length;i++)
		{
			a[i]= sc.nextInt();
		}
		max(a);
	}
}
