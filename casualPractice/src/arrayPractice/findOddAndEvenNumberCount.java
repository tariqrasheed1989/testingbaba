package arrayPractice;

public class findOddAndEvenNumberCount 
{
	public static void main(String[] args) 
	{
		int[]num= {2,3,9,5,6,7};
		int odd=0;
		int even=0;
		
		for(int i=0;i<num.length;i++)
		{
			if(num[i]%2==0) 
			{
				even++;
			}
			else {
				odd++;
			}
		}
		
		System.out.println("Even numbers : "+even);
		System.out.println("Odd Numbers :"+odd);
	}
}
