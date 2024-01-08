package misc;

public class BreakString 
{
	public static void main(String[] args) 
	{
		String veg="Cucumber";
		String web="Cucumber - 1 Kg";
		
		int Idx=web.indexOf("-");
		System.out.println("Index : "+Idx );
		String out=web.substring(0, Idx-1);
		System.out.println(out);
				
		
	}

}
