package solution;

import java.util.HashMap;

public class Solution {
	public int[] twoSum(int[] numbers, int target) {
		if(numbers == null || numbers.length <= 1){
			return new int[] {-1, -1};
		}
		
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < numbers.length; i++){
			int remain = target - numbers[i];
			
			if(hashMap.containsKey(remain)){
				return new int[] {
						Math.min(i, hashMap.get(remain)) + 1,
						Math.max(i, hashMap.get(remain)) + 1
				};
			}
			
			hashMap.put(numbers[i], i);
		}
        
		return new int[] {-1, -1};
    }
}
