package sol;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

	/**
	 * Given a set of distinct integers, S, return all possible subsets.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] A = {1,2,3};
		ArrayList<ArrayList<Integer>> r = new Solution().subsets(A);
		
		for(ArrayList<Integer> a : r){
			for(int b : a)
				System.out.print(b);
			System.out.println();
		}

	}
	
	public ArrayList<ArrayList<Integer>> subsets(int[] S) {
		// Start typing your Java solution below
		// DO NOT write main() function
		
		Arrays.sort(S);

		ArrayList<ArrayList<Integer>> results = new ArrayList<ArrayList<Integer>>();
		results.add(new ArrayList<Integer>());

		for (int i = 0; i < S.length; i++) {
			int prev_size = results.size();
			for (int j = 0; j < prev_size; j++) {
				ArrayList<Integer> r = new ArrayList<Integer>(results.get(j));
				r.add(S[i]);
				results.add(r);
			}
		}

		return results;
	}
	
	

}
