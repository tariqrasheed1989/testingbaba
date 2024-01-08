package collections;

import java.util.HashSet;
import java.util.Set;

public class Hash_Set 
{
	public static void main(String[] args) 
	{
		Set<Integer> set=new HashSet<Integer>();
		set.add(32);
		set.add(12);
		set.add(76);
		set.add(89);
		set.add(22);
		
		//lets try to add 12 again
		set.add(12);
		
		
		System.out.println(set);//It won't take the duplicate of 12.
		set.remove(12);//to remove
		System.out.println(set);
		System.out.println(set.contains(32));//to check if 21 contains in the set
		System.out.println(set.isEmpty());//to check whether set is empty
		System.out.println(set.size());//to check the number of element present
		set.clear();//to remove all the elements
		System.out.println(set.isEmpty());//to check whether empty or not.
		
	}
}
