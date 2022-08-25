package collections;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Priority_Queue 
{
	public static void main(String[] args) 
	{
		Queue<Integer>pq=new PriorityQueue<>(Comparator.reverseOrder());
		pq.offer(12);
		pq.offer(89);
		pq.offer(45);
		pq.offer(55);
		System.out.println(pq);//
		pq.poll();//it will remove the smallest number
		System.out.println(pq);
	}
}
