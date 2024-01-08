package patterns;

public class pattern6 
{/*
	*
	***
	*****
	*******
*/
	static void getPattern6(int num)
	{
		for(int row=1;row<=num;row++)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print("*");
			}
			System.out.println();
			row++;
		}
	}
	public static void main(String[] args) 
	{
		getPattern6(7);
	}
	

}
