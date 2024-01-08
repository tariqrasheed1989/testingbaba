package patterns;

public class pattern7 
{/*
	  * 
     * * 
    * * * 
   * * * * 
  * * * * * 
 * * * * * * 
 
*/
	static void getPattern7(int num)
	{
		for(int row=0;row<=num;row++)
		{
			for(int space=num-row;space>=0;space--)
			{
				System.out.print(" ");
			}
			for(int col=0;col<=row;col++)
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
