package solution;

public class Solution {
	public boolean search(int[] A, int target) {
        if(A == null || A.length == 0){
        	return false;
        }
        
        int left = 0, right = A.length - 1;
        
        while(left <= right){
        	int mid = left + (right - left) /2;
        	
        	if(A[mid] == target){
        		return true;
        	}
        	else if (A[mid] < A[right]){
        		if(A[right] >= target && A[mid] < target){
        			left = mid + 1;
        		}
        		else{
        			right = mid - 1;
        		}
        	}
        	else if(A[mid] > A[left]){
        		if(A[mid] > target && A[left] <= target){
        			right = mid - 1;
        		}
        		else{
        			left = mid + 1;
        		}
        	}
        	else if (A[mid] == A[right]){
        		right--;
        	}
        	else{
        		left++;
        	}
        }
        
        return false;
    }
}
