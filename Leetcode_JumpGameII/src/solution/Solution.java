package solution;

public class Solution {
	public int jump(int[] A) {
        if(A == null){
        	return 0;
        }
        
        int[] steps = new int[A.length];
        steps[0] = 0;
        
        for(int i = 1; i < steps.length; i++){
        	steps[i] = Integer.MAX_VALUE;
        	
        	for(int j = 0; j < i; j++){
        		if(steps[j] != Integer.MAX_VALUE && j + A[j] >= i){
        			steps[i] = steps[j] + 1;
        			break;
        		}
        	}
        }
        
        return steps[steps.length - 1];
    }
}
