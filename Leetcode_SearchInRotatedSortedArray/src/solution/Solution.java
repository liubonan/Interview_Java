package solution;

public class Solution {
	public int search(int[] A, int target) {
        if(A == null || A.length == 0){
        	return -1;
        }
        
        int left = 0, right = A.length - 1;
        
        while(left <= right){
        	int mid = left + (right - left) /2;
        	
        	if(A[mid] == target){
        		return mid;
        	}
        	else if (A[mid] < A[right]){
        		if(A[right] >= target && A[mid] < target){
        			left = mid + 1;
        		}
        		else{
        			right = mid - 1;
        		}
        	}
        	else{
        		if(A[mid] > target && A[left] <= target){
        			right = mid - 1;
        		}
        		else{
        			left = mid + 1;
        		}
        	}
        }
        
        return -1;
    }
}
