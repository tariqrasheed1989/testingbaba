package arrayPractice;

import java.util.Scanner;

public class StringReverse 
{
	public void getreverse(String input)
	{
		String output="";
		char c[]=input.toCharArray();
		for(int i=c.length-1;i>=0;i--)
		{
			output=output+c[i];
		}
		System.out.println(output);
	}
	public static void main(String[] args) 
	{
		StringReverse ob=new StringReverse();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the text");
		String input=sc.next();
		ob.getreverse(input);
		sc.close();
		
	}
}
