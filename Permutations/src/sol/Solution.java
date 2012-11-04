package sol;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {

	/**
	 * Given a collection of numbers, return all possible permutations.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] A = {1,2,3};
		
		ArrayList<ArrayList<Integer>> r = new Solution().permute(A);
		
		for(ArrayList<Integer> a : r){
			for(int b : a)
				System.out.print(b);
			System.out.println();
		}
	}
	
	public ArrayList<ArrayList<Integer>> permute(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
		ArrayList<ArrayList<Integer>> results = new ArrayList<ArrayList<Integer>>();
		
		Queue<ArrayList<Integer>> result = new LinkedList<ArrayList<Integer>>();
		result.add(new ArrayList<Integer>());
		
		for(int i = 0; i< num.length;i++){
			int prev_size = result.size();
			for(int j = 0; j < prev_size; j++){
				ArrayList<Integer> r = result.remove();
				for(int k = 0; k <= r.size(); k++){
					ArrayList<Integer> elem = new ArrayList<Integer>();
					
					
					for(int s = 0; s < k; s++){
						elem.add(r.get(s));
					}
					elem.add(num[i]);
					for(int s = k; s < r.size(); s++){
						elem.add(r.get(s));
					}
					
					result.add(elem);
				}
				
			}
		}
		results.addAll(result);
		return results;       
    }

}
