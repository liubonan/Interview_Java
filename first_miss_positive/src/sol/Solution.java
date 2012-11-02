package sol;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] A = {3,4,-1,1};
		System.out.print(new Solution().firstMissingPositive(A));

	}
	
	public int firstMissingPositive(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function

		if(A.length == 0)
			return 1;
		
		int A_length = 0;
		
		for(int i = 0; i < A.length; i++){
			if (A[i] <= 0){
				A[i] = Integer.MAX_VALUE;
			}
		}
		
		for(int i = 0; i < A.length; i++){
			if(Math.abs(A[i]) < A.length){
				A[Math.abs(A[i])] = (-1) * Math.abs(A[Math.abs(A[i])]);
			}
			else if(Math.abs(A[i]) == A.length)
				A_length = 1;
		}
		
		for(int i = 1; i < A.length; i++){
			if(A[i] > 0){
				return i;
			}
		}
		
		
		return A.length + A_length;
		
        
    }

}
