package solution;

import java.util.Arrays;

public class Solution {
	public int threeSumClosest(int[] num, int target) {
		if(num == null || num.length < 3){
			return 0;
		}
		
		Arrays.sort(num);
		
		int closestSum = target - Integer.MAX_VALUE;
		for(int i = 0; i < num.length; i++){
			int remainder = target - num[i];
			
			int left = i + 1, right = num.length - 1;
			
			while(left < right){
				int diff = remainder - num[left] - num[right];
				if(Math.abs(diff) < Math.abs(target - closestSum)){
					closestSum = num[left] + num[right] + num[i];
				}
				
				if(diff == 0){
					return target;
				}
				else if(diff > 0){
					left++;
				}
				else{
					right--;
				}
			}
		}
		
        return closestSum;
    }
}
