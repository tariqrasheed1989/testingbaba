package interviewQuestions;

public class SwappingNumbers 
{//swapping numbers without temp
	public static void getdata()
	{
		int a=20;
		int b=10;
		
		a=a+b; //30
		b=a-b; //20;
		a=a-b;
		System.out.println("a= "+a+" b= "+b);
	}
	
	public static void main(String[] args) 
	{
		getdata();
	}
}