package patterns;

public class pattern5 
{/*
	*
	**
	***
	****
	*****
	****
	***
	**
	*
*/	
	static void getpattern5(int num)
	{
		for(int row=0;row<=2*num-1;row++)
		{
			int temp=row>num?2*num-row:row;//if condition
			{
				for(int col=0;col<=temp-1;col++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
			
		}
	}
	public static void main(String[] args) 
	{
		getpattern5(5);
	}

}
