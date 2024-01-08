package misc;

public class Keyword 
{
	public double getpriceaus(String str)
	{
		String strnew=str.replace("$", "");
		
		return Double.parseDouble(strnew);
		
	}
	public static void main(String[] args) 
	{
		String P1="$56.00";
		Keyword ob=new Keyword();
		double newprice=ob.getpriceaus(P1);
		System.out.println(newprice);
	
	}
}
