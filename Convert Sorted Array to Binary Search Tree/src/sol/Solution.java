package sol;



public class Solution {

	/**
	 * Given an array where elements are sorted in ascending order, 
	 * convert it to a height balanced BST.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] num = {1,2,3,4,5,6,7};
		
		System.out.print(new Solution().sortedArrayToBST(num).val);

	}
	
	public TreeNode sortedArrayToBST(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
		if(num == null || num.length == 0)
			return null;
		else
			return array2BST(0,num.length-1,num);
		
    }
	
	public TreeNode array2BST(int p, int q, int[] num){
		
		if(p == q){
			return new TreeNode(num[p]);
		}else{
			int mid = (p+q)/2;
			TreeNode temp = new TreeNode(num[mid]);
			if(mid != p)
				temp.left = array2BST(p,mid-1,num);
			if(mid+1 <= q)
				temp.right = array2BST(mid+1,q,num);
			return temp;
		}
		
	}


}
