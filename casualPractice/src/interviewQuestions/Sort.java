package interviewQuestions;

import java.util.ArrayList;

public class Sort 
{
	public static void main(String[] args) 
	{
		int a[]= {1,4,3,5,2}; // sort this
		int temp;
		for(int i=0; i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<=a[j])//greater than for ascending order
				{				// Less than for descending order
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		ArrayList<Integer>li=new ArrayList<Integer>();
		
		li.toArray();
		
		for(int k=0;k<a.length;k++)
		{
			System.out.println(a[k]);
		}
	}
}
