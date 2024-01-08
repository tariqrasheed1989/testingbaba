package interviewQuestions;

public class PrintLastWord 
{
	public static void main(String[] args) 
	{
		String input="My name is udit";
		String[] input1=input.split(" ");
		int num=input1.length-1;
		String output=input1[num];
		System.out.println(output);
		
		char[] a=output.toCharArray();
		
		String b="";
		for(int i=a.length-1;i>=0;i--)
		{
			b=b+a[i];
		}
		System.out.println(b);
		
	}
}
