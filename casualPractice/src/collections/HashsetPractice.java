package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashsetPractice 
{	
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add("Tariq");
		al.add("Arhan");
		al.add("Farhana");
		al.add("Maisha");
		al.add("Ibrahim");
		
		HashSet<Object> hs=new HashSet<Object>();
		hs.add(30);
		hs.add(40);
		hs.add(20);
		hs.add(40);
		System.out.println(hs);
		
		
		hs.addAll(al);
		System.out.println(hs);
		
		Iterator itr=hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		hs.remove(20);
		System.out.println(hs);
		
		System.out.println(hs.contains("Tariq"));
		hs.clear();
		System.out.println(hs);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
