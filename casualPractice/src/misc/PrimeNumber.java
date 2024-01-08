package misc;

import java.util.Scanner;

public class PrimeNumber 
{
	public void getprime(int num)
	{
		boolean flag=false;
		if(num<2)
		{
			System.out.println(num+" is not a prime number");
		}
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag=true;
				System.out.println(num+" is not a prime number.");
				break;
			}
		}
		if(flag==false)
		{
			System.out.println(num+" is a prime number.");
		}
	}
	
	public static void main(String[]args)
	{
		PrimeNumber ob =new PrimeNumber();
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the number");
		int num=sc.nextInt();
		ob.getprime(num);
		sc.close();
		
	}
}
