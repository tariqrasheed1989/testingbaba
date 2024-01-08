package misc;

public class StaticMethod 
{
	static int num=1;
	public void display()
	{
		System.out.println("I am non static method");
	}
	
	void testStatic(int num2)
	{
	//	System.out.println(num+num2);
		int num=6;
		System.out.println(this.num);
	}
	
	public static void main(String[] args) 
	{
		StaticMethod ob= new StaticMethod();
		ob.testStatic(4);
		
	}
}
