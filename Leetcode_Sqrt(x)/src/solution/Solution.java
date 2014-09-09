package solution;

public class Solution {
	public int sqrt(int x) {
        if(x < 0){
        	return -1; // error
        }
        
        long low = 0;
        long high = x;
        
        while(low <= high){
        	long mid = low + (high - low) / 2;
        	
        	if(mid * mid <= x){
        		low = mid + 1;
        	}
        	else{
        		high = mid - 1;
        	}
        }
        
        return (int)high;
    }
}
