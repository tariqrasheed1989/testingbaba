package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListUnique 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer>al=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<5;i++)
		{
			System.err.println("Please enter number");
			int number=sc.nextInt();
			if(!al.contains(number))
			{
				al.add(number);
			}
		}
		
		Collections.sort(al);
		
		System.out.println(al);
		
		

	}
}
