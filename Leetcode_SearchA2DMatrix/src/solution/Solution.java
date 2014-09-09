package solution;

public class Solution {
	public boolean searchMatrix(int[][] matrix, int target) {
		
		if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
			return false;
		}

		int low = 0, high = matrix.length - 1;
		
		while(low <= high){
			int mid = low + (high - low) / 2;
			
			if(matrix[mid][0] <= target){
				low = mid + 1;
			}
			else{
				high = mid - 1;
			}
		}
		
		int index = Math.max(high, 0);
		
		low = 0;
		high = matrix[0].length - 1;
		
		while(low <= high){
			int mid = low + (high - low) / 2;
			
			if(matrix[index][mid] == target){
				return true;
			}
			else if(matrix[index][mid] < target){
				low = mid + 1;
			}
			else{
				high = mid - 1;
			}
		}
		
		return false;
	}

}
