package sol;

public class Solution {

	/**
	 * Given a sorted array, remove the duplicates in place 
	 * such that each element appear only once and return the 
	 * new length. Do not allocate extra space for another 
	 * array, you must do this in place with constant memory.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] A = {1,1,2,3,4,4,5,5,5,6};
		System.out.println(new Solution().removeDuplicates(A));
		for(int num:A)
			System.out.println(num);

	}
	
	public int removeDuplicates(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
		
		if(A.length == 0 || A.length == 1){
			return A.length;
		}
		int j = 0;
        for(int i = 1; i < A.length; i++){
        	if(A[i] == A[i-1] ){
        		if(i != A.length-1)
        			continue;
        		else
        			A[j++] = A[i];
        		
        	}
        	else {
        		if(i != A.length-1){
        			A[j] = A[i-1];
            		j++;
        		}
        		else{
        			A[j++] = A[i-1];
        			A[j++] = A[i];
        		}
        			       		
        		
        	}
        }
        
        for(int i = j; i < A.length; i++){
        	A[i] = 0;
        }
        
        return j;
    }

}
