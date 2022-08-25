package arrayPractice;

import java.util.Scanner;

public class Getmax
{
	public void maximum(int input[])
	{
		int num=0;
		for(int j=0;j<input.length;j++)
		{
			if(input[j]>num)
			{
				num=input[j];
			}
		}
		System.out.println(num);
		
	}
	public static void main(String[] args) 
	{	
		Scanner sc=new Scanner(System.in);
		Getmax ob=new Getmax();
		System.out.println("Please enter the 5 numbers");
		int input[]=new int[5];
		for(int i=0;i<5;i++)
		{
			input[i]=sc.nextInt();
		}
		ob.maximum(input);
		sc.close();
		
	}
}
