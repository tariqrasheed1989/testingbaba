package arrayPractice;

import java.util.ArrayList;

public class CompareLists 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer>li=new ArrayList<Integer>();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		li.add(5);
		
		ArrayList<Integer>li2=new ArrayList<Integer>();
		li2.add(1);
		li2.add(2);
		li2.add(3);
		li2.add(5);
		li2.add(4);
		
		for(int i=0;i<li.size();i++)
		{
			if(li.get(i)==li2.get(i))
			{
				System.out.println("True");
			}
			else
			{
				System.out.println("False");
			}
		}
	}
}
