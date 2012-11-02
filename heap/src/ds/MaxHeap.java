package ds;

import java.util.ArrayList;

public class MaxHeap {
	
	private ArrayList<Integer> heap; 
	
	public MaxHeap(int data)
	{
		heap = new ArrayList<Integer>();
		heap.add(data);
	}
	
	public void insert(int data)
	{
		heap.add(data);
		
		if(heap.size() == 1)
			return;
		
		int j = (int)(((heap.size() - 1) - 1) / 2);
		
		while(j >=0)
		{
			int current = heap.get(j);
			int left = -1, right = -1;
			
			if((2 * j + 1)< heap.size())
				left = heap.get(2 * j + 1);
			
			if((2 * j + 2)< heap.size())
				right = heap.get(2 * j + 2);
			
			if((left != -1) && (left > current) && (left > right))
			{
				heap.set(j, left);
				heap.set(2*j + 1, current);
			}
			
			if((right != -1) && (right > current) && (right > left))
			{
				heap.set(j, right);
				heap.set(2*j + 2, current);
			}
			
			if(j != 0)
				j = (int)((j-1)/2);
			else
				j = -1;
		}
		
	}
	
	public int delete()
	{
		if(heap.size() == 0)
			return -1;
		if(heap.size() == 1)
		{
			int max = heap.get(0);
			heap.clear();
			return max;
		}
		
		int max = heap.get(0);
		int size = heap.size();
		
		heap.set(0, heap.get(size-1));
		heap.remove(size-1);
		
		int i = 0;
		
		while(2*i + 2 <= size-2)
		{
			int current = heap.get(i);
			int left = heap.get(2*i + 1);
			int right = heap.get(2*i + 2); 
			
			if((left > current) && (left > right))
			{
				heap.set(i, left);
				heap.set(2*i + 1, current);
				i = 2*i + 1;
			}
			
			if((right > current) && (right > left))
			{
				heap.set(i, right);
				heap.set(2*i + 2, current);
				i = 2*i + 2;
			}
		}
		
		if(((2*i + 1) == (size-2)) && (heap.get(2*i + 1) > heap.get(i)))
		{
			int temp = heap.get(i);
			heap.set(i, heap.get(2*i + 1));
			heap.set(2*i + 1, temp);			
		}	
		
		return max;
	}
	
	

}
