package sol;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Solution {

	/**
	 * Given a collection of candidate numbers (C) and a target number (T), find
	 * all unique combinations in C where the candidate numbers sums to T.
	 * 
	 * Each number in C may only be used once in the combination.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { 10,1,2,7,6,1,5 };
		ArrayList<ArrayList<Integer>> r = new Solution().combinationSum2(A, 8);

		for (ArrayList<Integer> a : r) {
			for (int b : a)
				System.out.print(b);
			System.out.println();
		}
	}
	
	public ArrayList<ArrayList<Integer>> combinationSum2(int[] num, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
		Arrays.sort(num);

		ResultSet[][] number_of_ways = new ResultSet[num.length][target + 1];

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < target + 1; j++) {
				number_of_ways[i][j] = new ResultSet();
			}
		}

		for (int i = 0; i < num.length; i++) {
			ResultSet rs = new ResultSet();
			rs.add(new ArrayList());
			number_of_ways[i][0] = rs;
		}


		if (target >= num[0]) {
			ArrayList<Integer> temp = new ArrayList<Integer>();
			temp.add(num[0]);
			number_of_ways[0][num[0]].add(temp);
		}
		
		for (int i = 1; i < num.length; i++) {
			for (int j = 1; j < target + 1; j++) {
				for (int k = 0; k<=1 && k * num[i] <= j; k++) {
					ResultSet temp = new ResultSet(number_of_ways[i - 1][j - k
							* num[i]]);
					for (Iterator<ArrayList<Integer>> it = temp.data.iterator();it.hasNext();) {
						ArrayList<Integer> sol = (ArrayList<Integer>) (it.next().clone());
						for (int s = 0; s < k; s++)
							sol.add(num[i]);
						number_of_ways[i][j].add(sol);
					}
				}
			}
		}

		return number_of_ways[num.length - 1][target].returnvalue();

	}

}

class ResultSet {
	//ArrayList<ArrayList<Integer>> data = new ArrayList<ArrayList<Integer>>();
	HashSet<ArrayList<Integer>> data = new HashSet<ArrayList<Integer>>();

	void add(ArrayList<Integer> data) {
		this.data.add(data);
	}

	void add(ResultSet set) {
		
		Iterator<ArrayList<Integer>> it = set.data.iterator();
		while(it.hasNext()){
			this.data.add((ArrayList<Integer>)(it.next().clone()));
		}
		this.data = new HashSet<ArrayList<Integer>>(set.data);

	}

	public ResultSet(ResultSet rs) {
		
		this.data = new HashSet<ArrayList<Integer>>(rs.data);
	}

	public ResultSet() {
	}
	
	ArrayList<ArrayList<Integer>> returnvalue(){
		ArrayList<ArrayList<Integer>> r = new ArrayList<ArrayList<Integer>>();
		
		for(Iterator<ArrayList<Integer>> it = this.data.iterator();it.hasNext();){
			r.add(it.next());
		}
		return r;
		
	}

}
