package solution;

import java.util.*;

public class Solution {

	public List<List<Integer>> threeSum(int[] num) {
		
		if(num == null || num.length < 3){
			return new LinkedList<List<Integer>>();
		}
		
		Arrays.sort(num);
		List<List<Integer>> results = new LinkedList<List<Integer>>();
		
		for(int i = 0; i < num.length - 2; i++){
			if(i != 0 && num[i] == num[i-1]){
				continue;
			}
			
			int remainder = 0 - num[i];
			int left = i + 1, right = num.length - 1;
			while(left < right){
				if(num[left] + num[right] == remainder){
					results.add(Arrays.asList(new Integer[] {num[i], num[left], num[right]}));

					left++; 
					while(num[left] == num[left - 1] && left < right){
						left++;
					}
					
					right--;
					while(right != num.length - 1 && num[right] == num[right + 1] && left < right){
						right--;
					}
				}
				else if(num[left] + num[right] > remainder){
					right--;
				}
				else{
					left++;
				}
			}
		}
		
        return results;
    }
}
