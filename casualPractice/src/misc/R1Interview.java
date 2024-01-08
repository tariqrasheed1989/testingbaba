package misc;

public class R1Interview 
{
	public void getSeries(int num)
	{//Output=1,2,3,2,1
		 int n=0;
		for(int i=1;i<num*2;i++)
		{
			if(i<=num)
			{
				n=i;
				System.out.println(n);
			}
			else
			{	
				n=n-1;
				System.out.println(n);
			}
			
		}
		
		
	}
	public static void main(String[] args) 
	{
		
		R1Interview ob=new R1Interview();
		ob.getSeries(3);
	}

}
