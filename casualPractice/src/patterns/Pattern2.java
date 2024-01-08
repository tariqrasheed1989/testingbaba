package patterns;

public class Pattern2 
{/*print below pattern
	*****
	*****
	*****
	*****
	*****
*/
	static void getpattern2(int num)
	{
		for(int row=num;row>=1;row--)
		{
			for(int col=1;col<=num;col++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		getpattern2(5);
	}
}
