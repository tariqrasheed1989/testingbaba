package collections;

import java.util.Arrays;

public class Arrays_Class 
{
	public static void main(String[] args) 
	{
		int[] numbers= {11,22,3,4,5,6,7,8,9};
		//lets say if we have to find out the indexing of 4 in the array
		int index= Arrays.binarySearch(numbers, 9);
		
		System.out.println(index);
		//lets sort the array
		Arrays.sort(numbers);
		for(int i=0;i<numbers.length;i++)
		{
			System.out.println(numbers[i]);
		}
		
	}
}
