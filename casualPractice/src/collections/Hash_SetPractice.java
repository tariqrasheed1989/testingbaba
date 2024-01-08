package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Hash_SetPractice 
{
	//{13,45,67,23,33,12,19} add and remove all values which are greater than 30
	public static void main(String[] args) 
	{
		Integer []arr= {1,3,5,7,9,11};
		
		
		
		HashSet<Integer>set=new HashSet<Integer>();
		set.add(13);
		set.add(45);
		set.add(67);
		set.add(23);
		set.add(33);
		set.add(12);
		set.add(19);
		
		System.out.println(set);
		
		set.removeIf(value->value<30);
		
		System.out.println(set);
		
	}
}
