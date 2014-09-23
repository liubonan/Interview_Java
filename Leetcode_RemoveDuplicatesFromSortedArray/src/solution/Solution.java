package solution;

public class Solution {
	public int removeDuplicates(int[] A) {
        if(A == null || A.length == 0){
        	return 0;
        }
        
        int fast = 1, slow = 1;
        int prev = A[0];
        
        while(fast < A.length){
        	if(A[fast] != prev){
        		prev = A[fast];
        		A[slow] = A[fast];
        		slow++;
        	}
        	
        	fast++;
        }
        
        return slow;
    }
}
