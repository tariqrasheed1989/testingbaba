package collections;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashTablePractic 
{
	public static void main(String[] args) 
	{
		Hashtable<Integer, String> ht=new Hashtable();
		
		ht.put(103, "Sunday");
		ht.put(102, "Monday");
		ht.put(108, "Tuesday");
		ht.put(105, "Wednesday");
		ht.put(106, "Thursday");
		ht.put(109, "Friday");
		ht.put(110, "Saturday");
//		ht.put(112, null);// null key and value not allowed in HashTable
		
//		System.out.println(ht.get(108));
//		ht.remove(102, "Monday");
		
//		System.out.println(ht);
//		
//		for(int i:ht.keySet())
//		{
//			System.out.println(i+"=>"+ht.get(i));
//		}
	
//		for(Entry hash:ht.entrySet())
//		{
//			System.out.println(hash.getValue());
//		}
		
		Set s=ht.entrySet();
		Iterator itr=s.iterator();
		
		while(itr.hasNext())
		{
			//System.out.println(itr.next());
			Entry entry=(Entry)itr.next();
			System.out.println(entry.getKey()+" - "+entry.getValue());
		}
	}
}
