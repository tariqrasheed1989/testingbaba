package misc;

public class ReverseString 
{
	public static void main(String[] args)
	{
		String str="armstrong";
		char[] ca=str.toCharArray();
		int size=ca.length;
		String reversed="";
		for(int i=size-1;i>=0;i--)
		{
			reversed=reversed+ca[i];
		}
		System.out.println(reversed);
	}
	
	
}
