package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Collections_Class 
{
	public static void main(String[] args) 
	{
		List<Integer>li=new ArrayList<Integer>();
		li.add(12);
		li.add(22);
		li.add(45);
		li.add(54);
		li.add(9);
		li.add(78);
		li.add(9);
		
		//now we have to find the min number
		System.out.println("Min number is "+Collections.min(li));
		//now we have to find the max number
		System.out.println("Max number is "+Collections.max(li));
		//lets check the 9 occurance
		System.out.println("9 comes "+Collections.frequency(li, 9)+" times.");
		//lets sort the list in ascending
		Collections.sort(li);
		System.out.println(li);
		//lets sort in descending
		Collections.sort(li,Comparator.reverseOrder());
		System.out.println(li);
		
	}
}
