package collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedList_Demo 
{
	public static void main(String[] args) 
	{
		List<String>li=new LinkedList<String>();
		li.add("apple");
		li.add("banana");
		li.add("kiwi");
		li.add("fig");
		System.out.println(li);
		li.remove(2);
		System.out.println(li);
	}
}
