package collections;

import java.util.HashMap;
import java.util.Map;

public class Hash_Map 
{
	public static void main(String[] args) 
	{
		Map<String, Integer> numbers= new HashMap<String, Integer>();
		numbers.put("one", 1);
		numbers.put("two", 2);
		numbers.put("three", 3);
		numbers.put("four", 4);
	
		//let's we want to enter same key ("two", 22) with different value again.
		numbers.put("two", 22);
		System.out.println(numbers);//it will override it but not create new key.
		
		//suppose if we want not to enter any number if key is absent
		numbers.putIfAbsent("four",23);	//it will not enter 23 in four.
		
		//how to iterate map
	/*	for(Map.Entry<String, Integer> e: numbers.entrySet())
		{
			System.out.println(e);//to print the enter Map keys and values
			System.out.println(e.getKey());//if you want only keys
			System.out.println(e.getValue());//if you want only values
		}
	*/
		
		//another method to iterate Map only keys
		for(String key: numbers.keySet())
		{
			System.out.println(key);
		}

		//another method to iterate Map only values
		for(Integer value: numbers.values())
		{
			System.out.println(value);
		}
	}
	
}
