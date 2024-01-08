package collections;

import java.util.*;
public class StackPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Object> s=new Stack<Object>();
		s.push("Tariq");
		s.push("ABC");
		s.push("zxs");
		s.push("w123");
		s.push(null);
		s.push(null);
		System.out.println(s);
		System.out.println(s.peek());
		s.pop();
		System.out.println(s);
		System.out.println(s.peek());
		System.err.println(s.empty());

	}

}
