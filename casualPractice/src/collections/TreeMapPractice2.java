package collections;

import java.util.TreeMap;

public class TreeMapPractice2 
{
	public static void main(String[] args) 
	{
		TreeMap tm=new TreeMap();	
		tm.put(1,"Sunday");
		tm.put(2,"Monday");
		tm.put(3,"Tuesday");
		tm.put(4,"Wednesday");
		tm.put(5,"Thursday");
		tm.put(6, "Friday");
		tm.put(7,"Saturday");
		
		System.out.println(tm);
		System.out.println(tm.ceilingKey(0));//it will return the same key otherwise it will return next closest greater key
		System.out.println(tm.ceilingEntry(0));
		System.out.println(tm.firstKey());
		System.out.println(tm.floorKey(9));
		System.out.println(tm.headMap(5));//it will retrun all the entry before the given key
		System.out.println(tm.higherEntry(6));
		
	}
}
