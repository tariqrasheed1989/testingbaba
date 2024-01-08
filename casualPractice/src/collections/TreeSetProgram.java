package collections;

import java.util.Arrays;
import java.util.TreeSet;

public class TreeSetProgram 
{	//sort this array {7,3,5,9,1,2,7}
	public static void main(String[] args) 
	{
		int arr[]= {7,3,5,9,1,2,7};//given array
		TreeSet<Integer>sortedSet=new TreeSet<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			sortedSet.add(arr[i]);
		}
		
		int sortedArr[]=new int[sortedSet.size()];
		int index=0;
		for(int dd:sortedSet)
		{
			sortedArr[index]=dd;
			index++;
		}
		System.out.println("Original Array- "+(Arrays.toString(arr)));
		System.out.println("Sorted Array -"+Arrays.toString(sortedArr));
	}

}
