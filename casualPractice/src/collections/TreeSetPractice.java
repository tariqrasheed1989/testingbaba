package collections;

import java.util.TreeSet;

public class TreeSetPractice {
	
	public static void main(String[] args) 
	{
		TreeSet ts=new TreeSet();
		ts.add(40);
		ts.add(60);
		ts.add(20);
		ts.add(30);
		ts.add(10);
		System.out.println(ts);//it will print in sorted order.
		System.out.println(ts.descendingSet()); //it will reverse the sorting order in descending
		
		TreeSet ts1=new TreeSet();
		ts1.add("Tariq");
		ts1.add("Farhana");
		ts1.add("Maisha");
		ts1.add("Arhan");
		ts1.add("Ibrahim");
		System.out.println(ts1);
		
	}

}
