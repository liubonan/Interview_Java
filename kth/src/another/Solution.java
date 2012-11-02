package another;

import java.util.*;
import java.io.*;

//This is a random kth smallest algorithm
//The expected time complexity is O(n)
//The space complexity is O(1)
public class Solution {

    /**
     * Prints out the sum of the k smallest {@link Integer}s from input. For example, given the
     * input ([-2, 4, 5, 2, 6, 7], 2), the output should be 0.
     *
     * @param input a list of {@link Integer}s of arbitrary ordering and range.
     * @param k the number of {@link Integer}s to print
     */
    
    private int[] input = null;
    
	public int partition(int low, int high){
		
		if(low == high)
			return low;
		
		//select a element randomly
		int random_index = low+(int) Math.round(Math.random()*(high-low));		
		int temp = input[random_index];
		input[random_index]= input[low];
		input[low]=temp;

		int i = low + 1;
		int j = high;

		while (i < j) {
			while (input[i] < temp && i != j)
				i++;
			if (i == j)
				break;
			while (input[j] > temp && i != j)
				j--;
			if (i == j)
				break;
			int t = input[i];
			input[i]= input[j];
			input[j]= t ;
		}

		if (input[i] < temp) {			
			input[low]=input[i];
			input[i]=temp;
			return i;
		} else {
			input[low]= input[i-1] ;
			input[i-1]= temp;
			return i - 1;
		}
	}
	
	
    public Solution(List<Integer> input, int k) {    	
    	
        
    	//error handle
    	if(k > input.size()){
    		System.out.print(0);
    		return;
    	}    	
    	if(k <= 0){
    		System.out.print(0);
    		return;
    	}    	
    	if(input.size() == 0){
    		System.out.print(0);
    	}
    	
    	this.input = new int [input.size()];
    	for(int i = 0;i < input.size(); i++)
    		this.input[i] = input.get(i);
    	
    	//get the index of kth smallest element
    	int low = 0;
		int high = input.size() - 1;
		int index = partition(low, high);

		while (index != k - 1) {
			//make the range smaller
			if (k - 1 > index) {
				low = index + 1;
				index = partition(low, high);
			} else {
				high = index - 1;
				index = partition(low, high);
			}
		}
		
		//result will be the sum of first k elements
		int sum = 0;		
		for(int i = 0; i <= index; i++)
			sum += this.input[i];
		
		System.out.print(sum);
		
    }

    public static void main(String[] args) throws Exception{
        List<Integer> input = new ArrayList<Integer>();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            int k = Integer.parseInt(br.readLine());
            String line = null;
            while ((line = br.readLine()) != null && !line.isEmpty()) {
                input.add(Integer.parseInt(line));
            }
            new Solution(input, k);
        } finally {
            if (br != null)
                br.close();
        }    
        
    }
}