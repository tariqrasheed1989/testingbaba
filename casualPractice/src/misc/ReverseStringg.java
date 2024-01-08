package misc;

public class ReverseStringg 
{
	
	public static void main(String[] args) 
	{
		String text="India";
		char[]txt=text.toCharArray();
		String x="";
		for(int i=txt.length-1;i>=0;i--)
		{
			x=x+txt[i];
		}
		System.out.println(x);
	}

}
