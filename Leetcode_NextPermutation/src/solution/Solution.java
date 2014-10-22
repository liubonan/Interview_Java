package solution;

import java.util.Arrays;

public class Solution {
	public void nextPermutation(int[] num) {
        if(num == null || num.length == 0){
        	return;
        }
        
        int index = num.length - 1;
        int minIndex = -1;
        
        while(index > 0){
        	
        	if(num[index - 1] < num[index]){
        		minIndex = index;
        		for(int i = index + 1; i < num.length; i++){
        			if(num[i] > num[index - 1] && num[i] < num[minIndex]){
        				minIndex = i;
        			}
        		}
        		
        		break;
        	}
        	
        	index--;
        }
        
        if(index != 0){
            int temp = num[minIndex];
            num[minIndex] = num[index - 1];
            num[index - 1] = temp;
        }
        
        Arrays.sort(num, index, num.length);
    }
}
