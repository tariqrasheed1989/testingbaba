package arrayPractice;

public class RemoveDuplicatte 
{
	public static void main(String[] args) 
	{
		String value="aaabbbhjjccd";
		char [] a=value.toCharArray();
		
		String output1="";
		
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}				
			}
			if(count<1)
			{
				output1=output1+a[i];
			}

		}
		System.out.println(output1);
		
	}
}
