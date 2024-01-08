package patterns;

public class Pattern1 
//YouTube link : https://youtu.be/xzstcj3Cuso
//YouTube Link : https://youtu.be/lsOOs5J8ycw
{/*print below pattern
	*
	**
	***
	****
	*****
*/	
	static void getpattern1(int num)
	{
		for(int row=1;row<=num;row++)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) 
	{
		getpattern1(5);
		
	}
}
