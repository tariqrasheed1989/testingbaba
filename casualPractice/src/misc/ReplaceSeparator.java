package misc;

public class ReplaceSeparator 
{
	public static void main(String[] args) 
	{
		String num="1323.00";
		String number = "";
		
		
		if(num.contains(","))
		{
			number= num.replace(",", "");
		}else {
			number=num;
		}
		
		System.out.println(number);
	}
}
