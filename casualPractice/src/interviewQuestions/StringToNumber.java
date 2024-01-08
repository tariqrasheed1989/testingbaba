package interviewQuestions;

//test1234#$baba extract only number from this.
public class StringToNumber 
{
	public void getnumber(String txt)
	{
		String out="";
		char number[]=txt.toCharArray();
		for(int i=0;i<number.length;i++)
		{
			if(Character.isDigit(number[i]))
			{
				out=out+number[i];
			}
		}
		System.out.println(out);
	}
	public static void main(String[] args) 
	{
		StringToNumber ob=new StringToNumber();
		String txt="test1234#$baba";
		ob.getnumber(txt);
	}
}
