package collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapPractice 
{
	public static void main(String[] args) 
	{
		TreeMap<Integer, String> tm=new TreeMap();
		tm.put(103, "Abraham");
		tm.put(102, "John");
		tm.put(106, "Salman");
		tm.put(107, "Khan");
		tm.put(101, "Akshay");
		tm.put(104, "Shahrukh");
		
		System.out.println(tm);
		
		for(Map.Entry map:tm.entrySet())
		{
			System.out.println(map.getKey()+"->"+map.getValue());
		}
		
		System.out.println(tm.ceilingKey(105));
		System.out.println(tm.ceilingEntry(105));
		System.out.println(tm.firstEntry());
		System.out.println(tm.get(103));
	}
}
