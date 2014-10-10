package solution;

public class Solution {
	public void sortColors(int[] A) {
        if(A == null || A.length == 0){
        	return;
        }
        
        int left = 0, right = A.length - 1, i = 0;
        while(i <= right){
        	if(A[i] == 0){
        		if(i == left){
        			i++;
        			left++;
        		}
        		else{
            		swap(A, i, left);
            		left++;
        		}
        	}
        	else if(A[i] == 2){
        		swap(A, i, right);
        		right--;
        	}
        	else{
        		i++;
        	}
        }
    }
	
	private void swap(int[] A, int i, int j){
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}
}
