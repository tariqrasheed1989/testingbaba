package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Hash_setPractice2 {

	public static void main(String[] args) 
	{
		Integer[] arr= {3,6,9,12,9,12};	
		List<Integer>li=Arrays.asList(arr);
		HashSet<Integer>set=new HashSet<Integer>(li);
		System.out.println(set);
		Integer[]convertedArr= set.toArray(new Integer[0]);
		
		
	}

}
