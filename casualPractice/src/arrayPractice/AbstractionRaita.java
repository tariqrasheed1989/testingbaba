package arrayPractice;

interface car
{
	int tyre=4;
	public int extratyre();
	
	 public int seat();
}

abstract class Hyundai implements car
{
	abstract public String steering();
	
	public int extratyre()
	{
		return 1;
	}
	
}

public class AbstractionRaita extends Hyundai
{

	public int seat()
	{
		return 4;
	}
	public String steering()
	{
		return "alloy";
	}
	
	public static void main(String[] args) 
	{
		AbstractionRaita ob=new AbstractionRaita();
		System.out.println(ob.extratyre());
		System.out.println(ob.seat());
		System.out.println(ob.steering());
		System.out.println(tyre);

	}
}
