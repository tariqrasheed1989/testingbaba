package collections;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedlistDemo
{
	public static void main(String[] args) 
	{
		Queue<Integer>queue=new LinkedList<Integer>();
		// we write this code because linkedlist implements Queue Interface
		queue.offer(12);//to add elements
		queue.offer(34);
		queue.offer(67);
		System.out.println(queue);
		//queue.poll();//to remove the first entered element.
		System.out.println(queue);
		System.out.println(queue.peek());//to show the element which is next to out of the queue.
		
		
		
	}
}
