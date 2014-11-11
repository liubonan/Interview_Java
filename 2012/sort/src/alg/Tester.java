package alg;

import java.util.ArrayList;
import java.util.List;

public class Tester {
	
	static public void main(String[] args)
	{
		List<Integer> test = new ArrayList<Integer>();
		
		for(int i = 0; i < 10; i++)
		{			
			test.add((int)(Math.random() * 100));
		}
		
		QuickSort qs = new QuickSort(test);
		
		qs.quicksort(0, test.size()-1);
		
		for(int i = 0; i < 10; i++)
		{			
			System.out.print(test.get(i) + " ");
		}
		
		System.out.println();
		qs.out();
		
	}
	
	

}
