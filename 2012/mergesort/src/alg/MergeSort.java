package alg;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
	
	
	public static void mergesort(ArrayList<Integer> array, int low, int high){
		
		if(low == high)
			return;
		
		
		
		ArrayList<Integer> results = new ArrayList<Integer>();
		
		int center = (low + high) / 2;

		mergesort(array, low, center);
		mergesort(array,center+1, high);
				
		
		int i=low,j=center+1;
		
		while(i<=center && j<=high){			
			if(array.get(i) < array.get(j)){
				results.add(array.get(i));
				i++;
			}
			else{
				results.add(array.get(j));
				j++;
			}				
		}
		
		if(i <= center){
			while(i<=center)
				results.add(array.get(i++));
		}
		
		if(j <= high){
			while(j<=high)
				results.add(array.get(j++));
		}
		
		
		for(i = low;i<=high;i++)
			array.set(i,results.get(i - low));
		
	}
	
	public static void main(String[] args){
		Integer[] a ={23,56,13,26,87,65,32,98};
		
		ArrayList<Integer> num = new ArrayList<Integer>(Arrays.asList(a));		
		mergesort(num,0,num.size()-1);
		for(int o : num){
			System.out.print(o + " ");
		}
	}

}
