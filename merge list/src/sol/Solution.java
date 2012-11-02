package sol;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] A = {0};
		int [] B = {1};
		new Solution().merge(A,0,B,1);
		for(int i : A)
			System.out.println(i);
	}
	
	public void merge(int A[], int m, int B[], int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
		if(m == 0){
			int i = n-1;
			while(i >= 0){
				A[i] = B[i];
				i--;
			}
			
		}
		else if(n == 0){
			
		}
		else{
			int i= m-1, j = n-1;
			int current = m + n - 1;
			
			while(i >=0 && j >= 0){
				A[current--] = (A[i] >= B[j])? A[i--] : B[j--];				
			}
			
			if(i < 0){
				for(; j >= 0; j--){
					A[current--] = B[j];
				}
			}			
		}
        
    }

}
