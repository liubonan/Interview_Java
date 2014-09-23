package solution;

public class Solution {
	public int removeDuplicates(int[] A) {
        if(A == null || A.length == 0){
        	return 0;
        }
        
        if(A.length <= 2){
        	return A.length;
        }
        
        int fast = 2, slow = 2;
        
        while(fast < A.length){
        	if(A[fast] != A[slow -1] || 
        			(A[slow -1] != A[slow - 2])){
        		A[slow] = A[fast];
        		slow++;
        	}
        	
        	fast++;
        }
        
        return slow;
    }
}
