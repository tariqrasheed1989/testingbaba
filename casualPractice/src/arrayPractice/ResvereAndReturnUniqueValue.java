package arrayPractice;

import java.util.Scanner;

public class ResvereAndReturnUniqueValue 

{//input = Deepak , out=kapeed, out1=kapd
	public void reverse(String input)
	{
		String out="";
		String out1="";
		
		char a[]=input.toCharArray();
		for(int i=a.length-1;i>=0;i--)
		{
			out=out+a[i];
		}
		char b[]=out.toCharArray();
		for(int x=0;x<b.length;x++)//k
		{
			int count = 0;
			
			for(int y=0;y<b.length;y++)//ke
			{
				if(b[x]==b[y])
				{
					count++;
				}
			}
			if(count<2)
			{
				out1=out1+b[x];
			}
			
		}			
		System.out.println(out);
		System.out.println(out1);
		
	}
	
	public static void main(String[] args) 
	{
		ResvereAndReturnUniqueValue ob=new ResvereAndReturnUniqueValue();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the word");
		String input=sc.next();
		ob.reverse(input);
		sc.close();
	}
}
