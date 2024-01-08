package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListWithIterator 
{
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		al.add("E");
		al.add("F");
		al.add("G");
		al.add("H");

		Iterator it=al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}
}
