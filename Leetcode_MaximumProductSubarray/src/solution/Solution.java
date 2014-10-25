package solution;

public class Solution {

	public int maxProduct(int[] A) {
        if(A == null || A.length == 0){
        	return 0;
        }
        
        boolean foundZero = false;
        int maxNegative = 1;
        int max = Integer.MIN_VALUE;
        int product = 1;
        
        for(int i = 0; i < A.length; i++){
        	if(A[i] == 0){
        		max = Math.max(0, max);
        		product = 1;
        		maxNegative = 1;
        	}
        	else{
        		product *= A[i];
        		
        		if(product > 0){
        			max = Math.max(max, product);
        		}
        		else{
        			max = Math.max(max, product / maxNegative);
        			maxNegative = maxNegative == 1
        					? product
        					: Math.max(maxNegative, product);
        		}
        	}
        }
        
        return max;
    }
}
