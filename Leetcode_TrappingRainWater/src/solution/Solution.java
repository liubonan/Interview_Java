package solution;

import java.util.Stack;

public class Solution {
	public int trap(int[] A) {
        if(A == null || A.length == 0){
        	return 0;
        }
        
        int water = 0;
        int top = 0;
        
        for(int i = 1; i < A.length; i++){
        	if(A[i] > A[top]){
        		top = i;
        	}
        }
        
        int left = A[0];
        for(int i = 1; i < top; i++){
        	if(A[i] > left){
        		left = A[i];
        	}
        	else{
            	water += (left - A[i]);
        	}
        }
        
        int right = A[A.length - 1];
        for(int i = A.length - 2; i > top; i--){
        	if(A[i] > right){
        		right = A[i];
        	}
        	else{
            	water += (right - A[i]);
        	}
        }
        
        return water;
    }
}
