package arrayPractice;

import java.util.Scanner;
//input=1,2,3,4,5,6,8,10,12////output={4,12},{10,6}
public class CreatePairs 
{
	public void getpairs(int input[],int sum)
	{
		
		for(int i=0;i<input.length;i++)
		{
			for(int k=i;k<input.length;k++)
			{
				if(input[i]+input[k]==sum&&input[i]!=input[k])
				{
					System.out.println("{"+input[i]+","+input[k]+"}");
				}
				
			}
		}

	}
	public static void main(String[] args) 
	{
		CreatePairs ob=new CreatePairs();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the 9 numbers");
		int input[]=new int[9];
		for(int i=0;i<9;i++)
		{
			input[i]=sc.nextInt();		
		}
		System.out.println("Please enter the outcome");
		int sum=sc.nextInt();
		ob.getpairs(input, sum);
		sc.close();
	}
}
