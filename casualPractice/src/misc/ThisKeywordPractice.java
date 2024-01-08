package misc;

public class ThisKeywordPractice 
{
	void m1(ThisKeywordPractice ob)
	{
		System.out.println("I am m1 method.");
	}
	void m2()
	{
		m1(this);
	}	
	public static void main(String[] args) 
	{
		ThisKeywordPractice ob=new ThisKeywordPractice();
		ob.m2();
	}
}