package sol;

public class Solution {

	/**
	 * Given a sorted array of integers, find the starting and ending position
	 * of a given target value.
	 * 
	 * Your algorithm's runtime complexity must be in the order of O(log n).
	 * 
	 * If the target is not found in the array, return [-1, -1].
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] A = {1,2,3,4,5,5,6,7};
		int [] B = new Solution().searchRange(A, 5);
		System.out.println(B[0]+" "+B[1]);
	}
	
	public int[] searchRange(int[] A, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int [] result = {-1,-1};
        
        int i = 0, j = A.length - 1;
        
        while(i < j - 1){
        	int mid = i + (j - i) / 2;
        	
        	if(A[mid] <= target){
        		i = mid;
        	}
        	else{
        		j = mid;
        	}
        }
        
        if(A[j] == target)
        	result[1] = j;
        else if(A[i] == target)
        	result[1] = i;
        else
        	return result;
        
        i = 0;
        j = A.length - 1;
        
        while(i + 1 < j){
        	int mid = i + (j - i) / 2;
        	
        	if(A[mid] >= target){
        		j = mid;
        	}
        	else{
        		i = mid;
        	}
        }
        
        if(A[i] == target)
        	result[0] = i;
        else if(A[j] == target)
        	result[0] = j;
        
        return result;
    }

}
