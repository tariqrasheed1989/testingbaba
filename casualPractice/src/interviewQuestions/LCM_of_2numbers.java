package interviewQuestions;

import java.util.Scanner;

public class LCM_of_2numbers 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int GCM=0; //Greatest Common Factor
		for(int i=1;i<=a;i++)
		{
			if(a%i==0&&b%i==0)
			GCM=i;
		}
		int LCM=a*b/GCM;
		System.out.println(LCM);
		sc.close();
	
	}
}
