package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapPractice 
{
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add(101);
		al.add(102);
		al.add(103);
		System.out.println(al);
		
			
		Map hm=new HashMap();
		hm.put(1, "Tariq");
		hm.put(4, "Ravi");
		hm.put(3, "Rahul");
		
		//hm.clear();
		System.out.println(hm);
		System.out.println(hm.containsKey(1));
		System.out.println(hm.containsValue("Ravi"));
		System.out.println(hm.get(3));
		hm.replace(3, "Maisha");
		System.out.println(hm);
	}
}
