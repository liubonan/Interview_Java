package solution;

public class Solution {
	public boolean canJump(int[] A) {
		if(A == null){
			return false;
		}
		
		int maxIndex = 0;
		
		for(int i = 0; i < A.length; i++){
			if(maxIndex < i){
				return false;
			}
			else if(maxIndex < A[i] + i){
				maxIndex = A[i] + i;
			}
		}
		
        return maxIndex >= A.length - 1;
    }
}
