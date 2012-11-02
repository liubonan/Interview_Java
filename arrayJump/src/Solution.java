
public class Solution {

	public static int arrayJmp ( int[] A ) {
	    
	    if(A == null || A.length == 0)
	        return -1;
	        
	    int pawn = 0;
	    int count = 0;
	    
	    while(pawn < A.length && pawn >= 0){
	        if(A[pawn]==0){
	            return -1;
	        }
	        count++;
	        int offset = A[pawn];  
	        A[pawn] = 0;      
	        pawn = pawn + offset;
	    }
	    
	    return count;     
	    
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] A = {2, 3, 1, 1, 3};
		System.out.println(arrayJmp(A));
	}

}
