package arrayPractice;

import java.util.Scanner;

public class ReverseStringSamePosition 
{
	public void getrevese(String input)
	{
		String out="";
		String a[]= input.split(" ");
		for(int i=0;i<a.length;i++)
		{
			char []b=a[i].toCharArray();
			for(int j=b.length-1;j>=0;j--)
			{
				out=out+b[j];
			}
			out=out+" ";
		}
		System.out.println(out);
	}
	public static void main(String[] args) 
	{
		ReverseStringSamePosition ob=new ReverseStringSamePosition();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the input");
		String input=sc.nextLine();
		ob.getrevese(input);
		sc.close();
	}
}
