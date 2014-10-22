package solution;

public class Solution {
	public int singleNumber(int[] A) {
        if(A == null || A.length == 0){
        	return 0;
        }
        
        int[] bits = new int[32];
        
        for(int i = 0; i < A.length; i++){
        	for(int j = 0; j < 32; j++){
        		bits[j] += (A[i] >> j) & 1;
        	}
        }
        
        int result = 0;
        for(int i = 31; i >= 0; i--){
        	if(bits[i] % 3 != 0){
        		result += (1 << i); 
        	}
        }
        
        return result;
    }
}
