package collections;

import java.util.ArrayList;
import java.util.Vector;

public class VectorPractice 
{
	public static void main(String[] args) 
	{
		ArrayList li=new ArrayList();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		li.add(5);
		li.add(6);
		
		
		Vector vc=new Vector(5,3);
		vc.addElement("aaa");
		vc.addElement("bbb");
		vc.addElement(7);
		vc.addElement(99);
		vc.addElement(87);
		vc.addElement(65);
		vc.addElement("eee");
		vc.addElement("hhh");
		vc.addElement(76);
		vc.addElement(99);
		
		vc.setElementAt("Tariq", 2);
		vc.insertElementAt("Abcd", 0);
		
		vc.clone();
		System.out.println(vc.lastIndexOf(99));
//		System.out.println(vc.capacity());
//		System.out.println(vc.firstElement());
//		
//		
//		
//		System.out.println(vc.lastElement());
//		System.out.println(vc);
	}
}
