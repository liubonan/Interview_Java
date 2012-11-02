package array_sum;

import java.util.ArrayList;
import java.util.List;

public class Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {4,5,7,8,9,20,1,3,5,2,11,15,16,19,23,5,3};
		int sum = 31;
		
		List<Integer> l = new ArrayList<Integer>();
		
		for(int i = 0;i<arr.length; i++)
			l.add(arr[i]);
		
		QuickSort q = new QuickSort(l);
		
		q.quicksort(0, l.size()-1);

		for(int i = 0;i<arr.length; i++)
			System.out.print(l.get(i) + " ");
		
		System.out.println();
		q.out();
		System.out.println();
		
		int i, j;
		i = 0;
		j=l.size()-1;
		
		while(i < j)
		{
			int ssum = l.get(i) + l.get(j);
			if(ssum == sum)
			{
				System.out.print(l.get(i) + "+" + l.get(j) + "="+sum);
                return;
			}
			else
			{
				if(ssum > sum)
					j--;
				else
					i++;
			}
		}
		
		System.out.print("fail");
		return;
		
		
	}

}
