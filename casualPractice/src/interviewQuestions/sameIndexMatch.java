package interviewQuestions;

import java.util.ArrayList;

public class sameIndexMatch 
{
	public static void main(String[] args) 
	{
		int a[]= {1,5,8,4,2};
		int b[]= {1,6,9,4,2};
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==b[i])
			{
				al.add(a[i]);			
			}
		}
		//System.out.println(al);
		
		Object c[]=al.toArray();
		
		for(Object ab:c)
		{
			System.out.println(ab);
		}
	}
}