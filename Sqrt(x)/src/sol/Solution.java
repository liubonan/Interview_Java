package sol;

public class Solution {

	/**
	 * Implement int sqrt(int x).Compute and return the square root of x.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(new Solution().sqrt(5));
	}
	
	public int sqrt(int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
        long  target = x;
		if(x < 0)
        	return -1;//error
        else if(x == 0)
        	return 0;
        else if(x == 1)
        	return 1;
        else{
        	int low=0, high=x;
        	long mid;
        	
        	while(low < high){
        		mid = (long)(low+high)/2;
        		if(mid*mid == target || (mid*mid < target && (mid+1)*(mid+1)>target)){
        			return (int)mid;
        		}
        		else if(mid*mid < target){
        			low = (int)mid+1;
        		}
        		else{
        			high = (int)mid-1;
        		}
        	}
        	
        	return low;
        }
    }

}
