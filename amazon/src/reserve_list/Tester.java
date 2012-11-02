package reserve_list;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Stack;


public class Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l = new LinkedList<Integer> ();
		Random r = new Random();
		
		for(int i = 0; i < 15; i++)
		{
			l.add(r.nextInt(100));
			System.out.print(l.get(i)+" ");
		}
		
		System.out.println();
		
		Stack<Integer> s = new Stack<Integer>();
		
		for(int i = 0; i < 15; i++)
			s.push(l.get(i));
		
		l.clear();
		
		for(int i = 0; i < 15; i++)
			l.add(s.pop());
		
		for(int i = 0; i < 15; i++)
		{
			System.out.print(l.get(i)+" ");
		}
		
	}

}
