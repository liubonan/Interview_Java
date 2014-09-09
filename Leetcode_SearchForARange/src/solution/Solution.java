package solution;

public class Solution {
	public int[] searchRange(int[] A, int target) {
		int lowBound = -1, highBound = -1;
		int targetIndex = -1, low = 0, high = A.length - 1;
		
		if(A == null || A.length == 0){
			return new int [] {lowBound, highBound};
		}
        
		while(low <= high){
			int mid = low + (high - low) / 2;
			
			if(A[mid] == target){
				targetIndex = mid;
				break;
			}
			else if(A[mid] < target){
				low = mid + 1;
			}
			else{
				high = mid - 1;
			}
		}
		
		if(targetIndex == -1){
			return new int [] {lowBound, highBound};
		}
		
		low = 0;
		high = targetIndex;
		while(low <= high){
			int mid = low + (high - low) / 2;
			
			if(A[mid] < target){
				low = mid + 1;
			}
			else{
				high = mid - 1;
			}
		}
		
		lowBound = Math.max(0, high + 1);
		
		low = targetIndex;
		high = A.length - 1;
		while(low <= high){
			int mid = low + (high - low) / 2;
			
			if(A[mid] <= target){
				low = mid + 1;
			}
			else{
				high = mid - 1;
			}
		}
		
		highBound = Math.min(A.length, low - 1);
		
		return new int [] {lowBound, highBound};
    }
}
