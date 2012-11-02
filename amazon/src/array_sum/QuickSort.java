package array_sum;

import java.util.List;


public class QuickSort {
	private List<Integer> data;
	
	public QuickSort(List<Integer> data)
	{
		this.data =data;
	}
	
	public void out()
	{
		for(int i = 0; i < data.size(); i++)
		{			
			System.out.print(data.get(i) + " ");
		}
	}
	
	public void quicksort(int p, int q)
	{
		if(p == q)
			return;
		else
		{
			int pivot = partition(p, q);
			
			if(pivot-1 >= p)
				quicksort(p, pivot-1);
			
			if(pivot+1 <=q)
				quicksort(pivot+1,q);
			
			return;
		}
		
	}
	
	public int partition(int p, int q)
	{
		int pivot = p;
		
		int i=p;
		for(int j=p+1;j<=q;j++)
		{
			if(data.get(j) <= data.get(pivot))
			{
				i++;
				int temp = data.get(i);
				data.set(i, data.get(j));
				data.set(j, temp);
			}
		}
		
		int temp = data.get(pivot);
		data.set(pivot, data.get(i));
		data.set(i, temp);
		
		return i;
	}
	
	

}
