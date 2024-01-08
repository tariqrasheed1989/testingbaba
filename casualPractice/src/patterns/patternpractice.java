package patterns;

public class patternpractice {
	
	public void pattern1(int n)
	{
		for(int i=1;i<=n; i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}

		System.out.println();

		}
	}
	public void pattern2(int n)
	{
		for(int i=1;i<=n;i++) {
			
			for(int k=1;k<=i;k++)
			{
				System.out.print("  ");
			}
			
			for(int j=i;j<=n;j++)
			{
				System.out.print("* ");
			}
			
			
			System.out.println();
		}
	}
	public void pattern3(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print("* ");
				
			}
			
			System.out.println();
		}
	}
	public void pattern4(int n)
	{
		for(int i=1;i<=n;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
			
		patternpractice ob =new patternpractice();
		//ob.pattern2(5);
		//ob.pattern1(5);
		//ob.pattern3(5);
		ob.pattern4(5);
	}
		
	}
