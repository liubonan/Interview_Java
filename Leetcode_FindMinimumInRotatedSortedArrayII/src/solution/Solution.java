package solution;

public class Solution {
	public int findMin(int[] num) {
        if(num == null || num.length == 0){
        	return 0;
        }
        
        int begin = 0, end = num.length - 1;
        
        while(begin  + 1 < end){
        	int mid = begin + (end - begin) / 2;
        	
        	if(num[mid] < num[begin]){
        		end = mid;
        	}
        	else if (num[mid] > num[end]){
        		begin = mid;
        	}
        	else if(num[mid] == num[begin]){
        		begin++;
        	}
        	else{
        		end--;
        	}
        }
        
        return Math.min(num[begin], num[end]);
    }
}
