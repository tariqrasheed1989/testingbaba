package patterns;

public class pattern3 
{/*print below pattern
	*****
	****
	***
	**
	*
*/	
	static void getpattern3(int num)
	{
		for(int row=num;row>=1;row--)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		getpattern3(5);
	}

}
