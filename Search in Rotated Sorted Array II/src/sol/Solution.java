package sol;

public class Solution {

	/**
	 * Follow up for "Search in Rotated Sorted Array": What if duplicates are
	 * allowed?
	 * 
	 * Would this affect the run-time complexity? How and why?
	 * 
	 * Write a function to determine if a given target is in the array.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] A = {4,5,6,7,0,1,2,2,2};
		System.out.print(new Solution().search(A,6));
	}
	
	public boolean search(int[] A, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        return search_rec(A,target,0,A.length-1)==-1?false:true;
        
    }
	
	public int search_rec(int[] A, int target, int left, int right){
		if(left > right){
			return -1;
		}
		else if(left == right){
			if(A[left] == target){
				return left;
			}
			else{
				return -1;
			}
		}
		else{
			int mid = (left + right)/2;
			
			if(A[mid] == target){
				return mid;
			}
			
			if(A[left] < A[mid]){
				
				if(A[mid] < target){
					return search_rec(A, target, mid+1, right);
				}
				else if(A[left] > target){
					return search_rec(A, target, mid+1, right);
				}
				else{
					return search_rec(A, target, left, mid-1);
				}
			}
			else if(A[left] > A[mid]){
				if(A[mid] > target){
					return search_rec(A,target,left,mid-1);
				}
				else if(A[right] < target){
					return search_rec(A,target,left,mid-1);
				}
				else{
					return search_rec(A,target,mid+1,right);
				}
			}
			else {
				int r_l = search_rec(A,target,left,mid-1);
				int r_r = search_rec(A,target,mid+1,right);
				if(r_l == -1)
					return r_r;
				else
					return r_l;					
			}
		}
	}

}
