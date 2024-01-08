package collections;

import java.util.ArrayList;
import java.util.Iterator;

import org.seleniumhq.jetty9.io.ssl.ALPNProcessor;

public class ArrayListPractice1 {
	public static void main(String[] args) {
		ArrayList<Object> AL = new ArrayList<Object>(5);
		AL.add(10);
		AL.add(30);
		AL.add(32);
		AL.add(33);
		AL.add(34);
		AL.add(35);
		AL.add(36);
		System.out.println(AL);

//method 1 to remove int from an arrayList		
//		//how to remove int value from an array 
//		int valueToRemove=35;// Int value which needs to be removed 
//		Object value=Integer.valueOf(valueToRemove);//this method will convert int into object 
//		AL.remove(value);//now we can remove it because "value" is now object.

		
//method 1 to remove int from an arrayList		
		int valueToRemove = 35;
		System.out.println(AL.indexOf(35));
		AL.remove(AL.indexOf(valueToRemove));

		// method 1 to iterate
		for (Object dd : AL) {
			System.out.println(dd);
		}
		// method 2 to iterate
//		Iterator it=AL.iterator();
//		while (it.hasNext())
//		{
//			System.out.println(it.next());
//			
//		}

		ArrayList<Object> ar = new ArrayList<Object>();
		ar.add("a");
		ar.add("b");
		ar.addAll(AL);
		System.out.println(ar);

		ar.remove("a");
		System.out.println(ar);
		ar.removeAll(AL);
		System.out.println(ar);
	}
	
	

}
