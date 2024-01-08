package patterns;

public class pattern4 
{/*
	1
	12
	123
	1234
	12345
*/
	
	static void getpattern4(int num)
	{
		for(int row=1;row<=num;row++)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print(col);
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) 
	{
		getpattern4(5);
	}
}
