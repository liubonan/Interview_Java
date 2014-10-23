package solution;

public class Solution {
	public int firstMissingPositive(int[] A) {
        if(A == null){
        	return 1;
        }
        
        for(int i = 0; i < A.length; i++){
        	
        	int tmp = A[i];
        	while(tmp > 0 && tmp - 1 < A.length){
        		int index = tmp - 1;
        		tmp = A[index];
        		A[index] = Integer.MIN_VALUE;
        	}
        }
        
        for(int i = 0; i < A.length; i++){
        	if(A[i] != Integer.MIN_VALUE){
        		return i + 1;
        	}
        }
        
        return A.length + 1;
    }
}
