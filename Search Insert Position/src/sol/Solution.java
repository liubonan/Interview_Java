package sol;

public class Solution {

	/**
	 * Given a sorted array and a target value, return the index if the target
	 * is found. If not, return the index where it would be if it were inserted
	 * in order.
	 * 
	 * You may assume no duplicates in the array.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] A = {1,3,5,6};
		System.out.println(new Solution().searchInsert(A, 5));
		System.out.println(new Solution().searchInsert(A, 2));
		System.out.println(new Solution().searchInsert(A, 7));
		System.out.println(new Solution().searchInsert(A, 0));
	}
	
	public int searchInsert(int[] A, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(A.length == 0)
        	return 0;
        int i = 0, j = A.length - 1;
        
        if(A[i] > target)
        	return 0;
        if(A[j] < target)
        	return j+1;
        
        while(i+1 < j){
        	int mid = i + (j - i) / 2;
        	if(A[mid] <= target){
        		i = mid;
        	}
        	else{
        		j = mid;
        	}
        }
        
        if(A[i] == target)
        	return i;
        else 
        	return j;
    }

}
