package solution;

public class Solution {
	public double findMedianSortedArrays(int A[], int B[]) {
        if(A == null || B == null){
        	return 0;
        }
        
        int m = A.length;
        int n = B.length;
        int k = (m + n + 1) / 2;
        
        if((m + n) % 2 == 0){
        	return (this.findKthNumber(A, 0, B, 0, k) +
        			this.findKthNumber(A, 0, B, 0, k + 1)) / 2.0;
        }
        else{
            return this.findKthNumber(A, 0, B, 0, k);
        }
    }
	
	private int findKthNumber(int[] A, int startA, int[] B, int startB, int k){
		if(A.length > B.length){
			return this.findKthNumber(B, startB, A, startA, k);
		}
		if(startA >= A.length){
			return B[startB + k - 1];
		}
		else if(startB >= B.length){
			return A[startA + k - 1];
		}
		else if(k == 1){
			return Math.min(A[startA], B[startB]);
		}
		
		int ka = Math.min(startA + k / 2 - 1, A.length - 1);
		int kb = startB + k - (ka - startA + 1) - 1;
		
		if(A[ka] == B[kb]){
			return A[ka];
		}else if(A[ka] < B[kb]){
			return this.findKthNumber(A, ka + 1, B, startB, k - ka + startA - 1);
		}else{
			return this.findKthNumber(A, startA, B, kb + 1, ka - startA + 1);
		}
	}
}
