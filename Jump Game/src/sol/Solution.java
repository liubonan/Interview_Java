package sol;

public class Solution {

	/**
	 * Given an array of non-negative integers, you are initially positioned at
	 * the first index of the array. Each element in the array represents your
	 * maximum jump length at that position. Determine if you are able to reach
	 * the last index. For example: A = [2,3,1,1,4], return true. A =
	 * [3,2,1,0,4], return false.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] A = {3,2,1,0,4};
		int [] B = {2,3,1,1,4};
		System.out.println(new Solution().canJump(A));
		System.out.println(new Solution().canJump(B));
	}
	
	public boolean canJump(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
		
		if(A == null || A.length == 0)
			return true;
        int curr_max = 0;
        for(int i = 0; i < A.length;i++){
        	if(curr_max >= i){
        		curr_max = Math.max(curr_max, i+A[i]);
        	}
        }
        
        return curr_max >= A.length-1;
    }

}
