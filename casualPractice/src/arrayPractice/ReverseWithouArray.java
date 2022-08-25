package arrayPractice;

import java.util.Scanner;

public class ReverseWithouArray 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the text.");
		String input=sc.next();
		
		StringBuilder sb=new StringBuilder(input);
		sb.reverse();
		System.out.println(sb);
		sc.close();
		
	}
}
