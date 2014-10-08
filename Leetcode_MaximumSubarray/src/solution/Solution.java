package solution;

public class Solution {

	public int maxSubArray(int[] A) {
        if(A == null || A.length == 0){
        	return 0;
        }
        
        int[] sum = new int[A.length];
        sum[0] = A[0];
        
        for(int i = 1; i < A.length; i++){
        	sum[i] = sum[i - 1] + A[i];
        }

        int result = Integer.MIN_VALUE;
        int minSum = 0;
        
        for(int i = 0; i < A.length; i++){
        	if(sum[i] - minSum > result){
        		result = sum[i] - minSum;
        	}
        	
        	if(sum[i] < minSum){
        		minSum = sum[i];
        	}
        }
        
        return result;
    }
}
