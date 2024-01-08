package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice 
{
	public static void main(String[] args) 
	{
		HashMap<Integer,String> hm=new HashMap();
		hm.put(101, "Tariq");
		hm.put(102, "Abhishek");
		hm.put(106, "Rahul");
		hm.put(104, "Ajay");
		hm.put(103, "Karan");
		hm.put(105, "Rohit");
		hm.put(103, "Abdul");		
		System.out.println(hm);
		
		hm.remove(106);
		System.out.println(hm);
		hm.replace(103, "Raju");
//		for(Map.Entry me:hm.entrySet())
//		{
//			System.out.println(me.getKey()+"->"+me.getValue());
//		}
		//retrive values one by one
		for(String dd:hm.values())
		{
			System.out.println(dd);
		}
		System.out.println(hm.size());
		
		//Retrieve keys only one by one
		for(int dd:hm.keySet())
		{
			System.out.println(dd);
		}
		
		System.out.println(hm.size());//will return the size
		
		//retrieve keys along with value
		for(int i:hm.keySet())
		{
			System.out.println(i+"->"+hm.get(i));
		}
		
	}
}
