package sol;
import java.util.*;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public ArrayList<ArrayList<Integer>> combinationSum(int[] candidates, int target) {
        
		Object [][] number_of_ways = new Object[candidates.length][target+1];
		
		for(int i = 0; i < candidates.length; i++){
			for(int j = 0; j < target+1; j++){
				number_of_ways[i][j] = new ArrayList<ArrayList<Integer>>();
			}
		}
		
		for(int j = 0; j < target+1; j++){
			ArrayList<Integer> sol = new ArrayList<Integer>();
			
			for(int t = 0;t < j;t ++){
				sol.add(1);
			}
			
			
			((ArrayList<ArrayList<Integer>>)(number_of_ways[0][j])).add(new ArrayList<Integer>());
			
		}
			
		
		number_of_ways = new ArrayList<ArrayList<Integer>>() [candidates.length][target+1];
		
		
        return null;
        
    }
}


