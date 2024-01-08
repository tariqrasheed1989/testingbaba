package interviewQuestions;

public class MaxDifference 
{
	public static void main(String[] args) 
	{
		int a[]= {2,5,6,15,20};//2,2,9,5
		int diff=0;
		int temp;
		for(int i=0; i<a.length-1;i++)
		{
			temp= a[i+1]-a[i];
			
			if(temp<diff)
			{
				diff=temp;
			}
		}
		System.out.println(diff);
	}
}
