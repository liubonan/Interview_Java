package solution;

public class Solution {
	public void merge(int A[], int m, int B[], int n) {
        int index = m + n - 1, indexA = m - 1, indexB = n - 1;
        
        while(indexA >= 0 && indexB >= 0){
        	if(A[indexA] >= B[indexB]){
        		A[index] = A[indexA];
        		indexA--;
        	}
        	else{
        		A[index] = B[indexB];
        		indexB--;
        	}
        	
        	index--;
        }
        
        if(indexB >= 0){
        	while(index >= 0){
        		A[index] = B[indexB];
        		index --;
        		indexB--;
        	}
        }
    }
}
