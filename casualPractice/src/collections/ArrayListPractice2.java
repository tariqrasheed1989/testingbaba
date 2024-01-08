package collections;

import java.util.ArrayList;

public class ArrayListPractice2 
{
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add(3);
		al.add(6);
		al.add(9);
		al.add(12);
		al.add(15);
		al.add(18);
		al.add(21);
		al.add(24);
		al.add(27);
		
		ArrayList al2=new ArrayList();
		al2.add(3);
		al2.add(6);
		al2.add(9);
		al2.add(12);
		
		al2.add(15);
		al2.add(18);
		al2.add(27);
		al2.add(24);
		al2.add(21);
		
		System.out.println("al Size" + al.size());
		System.out.println("al2 Size" + al.size());
		System.out.println(al.equals(al2));
		
	}
}
