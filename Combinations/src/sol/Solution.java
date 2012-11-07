package sol;
import java.util.*;

public class Solution {

	/**
	 * Given two integers n and k, return all possible combinations of k numbers
	 * out of 1 ... n.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		ArrayList<ArrayList<Integer>> r = new Solution().combine(3,2);
		
		for(ArrayList<Integer> a : r){
			for(int b : a)
				System.out.print(b);
			System.out.println();
		}

	}
	
	public ArrayList<ArrayList<Integer>> combine(int n, int k) {
        // Start typing your Java solution below
        // DO NOT write main() function
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		if(n <= 0 || n < k || k==0){        	
        	result.add(new ArrayList<Integer>());
        	return result;
        }
		
		
		for(int i = 0; i < n; i++){
			ArrayList<Integer> temp = new ArrayList<Integer>();
			temp.add(i+1);
			result.add(temp);
		}
		
		for(int i = 0; i < k-1; i++){
			ArrayList<ArrayList<Integer>> new_result = new ArrayList<ArrayList<Integer>>();
			for(int j = 0; j < result.size(); j++){				
				for(int s = result.get(j).get(result.get(j).size()-1)+1;s<=n;s++){
					ArrayList<Integer> temp = new ArrayList<Integer>(result.get(j));
					temp.add(s);
					new_result.add(temp);
				}
			}
			result = new_result;
		}
		
		return result;
        	
    }

}
