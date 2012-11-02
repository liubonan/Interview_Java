package sol;

public class Solution {

	/**
	 * @param args
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
		
		int count = 0;
		int j = 0;
        for(int i = 1; i < A.length; i++){
        	if(A[i] == A[i-1] ){
        		if(i != A.length-1){
        			count++;
        		}        			
        		else{
        			A[j++] = A[i];     			
        			A[j++] = A[i];        			
        		}
        			
        		
        	}
        	else {
        		if(i != A.length-1){        			
        			A[j++] = A[i-1];
        			if(count >= 1)
        				A[j++] = A[i-1];
        			count = 0;
        		}
        		else{
        			A[j++] = A[i-1];
        			if(count >= 1)
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
