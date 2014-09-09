package solution;

public class Solution {
	public int removeElement(int[] A, int elem) {
		
		if(A == null || A.length == 0){
			return 0;
		}

		int i = 0, j = A.length - 1;
		
		// One pass solution
		while(i < j){
			if(A[i] == elem){
				while(i < j && A[j] == elem){
					j--;
				}
				
				if(i != j){
					A[i] = A[j];
					j--;
				}
			}
			
			if(i >= j){
				break;
			}
			
			i++;
		}
		
		if(A[i] == elem){
			return i;
		}
		else{
			return i + 1;
		}
	}
}
