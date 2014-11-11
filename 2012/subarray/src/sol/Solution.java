package sol;

public class Solution {

	public static int maxSubArray(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int curSum = 0;
        int maxSum = 0;
        boolean flag = false;
        int max = Integer.MIN_VALUE;
        
        
        for(int i=0;i<A.length;i++){
            if(A[i] >= 0)
                flag = true;
            if(max < A[i] && A[i] < 0){
                max = A[i];
            }
            curSum += A[i];
            if(curSum < 0){
                curSum = 0;
            }
            if(curSum >= maxSum){
                maxSum = curSum;                
            }
        }
        
        if(!flag)
            return max;
        else        
            return maxSum;
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] num = {31,-41,59,26,-53,58,97,-93,-23,84};
		System.out.println(maxSubArray(num));

	}

}
