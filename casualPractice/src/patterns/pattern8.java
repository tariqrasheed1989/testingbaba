package patterns;

public class pattern8 
{
	static void getPattern7(int num)
	{
		for(int row=1;row<num;row++)
		{
			for(int space=num-1;space>row;space--)
			{
				System.out.print(" ");
			}
			for(int col=0;col<row;col++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int row1=num-1;row1>0;row1--)
		{
			for(int space1=0;space1<num-row1;space1++)//1
			{
				System.out.print(" ");
			}
			for(int col1=row1-1;col1>0;col1--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) 
	{
		getPattern7(5);
	}


}
