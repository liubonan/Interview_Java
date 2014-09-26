package solution;

public class Solution {
	public int singleNumber(int[] A) {
        if(A == null || A.length == 0){
        	return 0;
        }
        
        for(int i = 1; i < A.length; i++){
        	A[0] ^= A[i];
        }
        
        return A[0];
    }
}
