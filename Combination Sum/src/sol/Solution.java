package sol;

import java.util.*;

public class Solution {

	/**
	 * Given a set of candidate numbers (C) and a target number (T), find all
	 * unique combinations in C where the candidate numbers sums to T.
	 * 
	 * The same repeated number may be chosen from C unlimited number of times.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { 2, 3, 6, 7 };
		ArrayList<ArrayList<Integer>> r = new Solution().combinationSum(A, 7);

		for (ArrayList<Integer> a : r) {
			for (int b : a)
				System.out.print(b);
			System.out.println();
		}

	}

	public ArrayList<ArrayList<Integer>> combinationSum(int[] candidates,
			int target) {

		Arrays.sort(candidates);

		ResultSet[][] number_of_ways = new ResultSet[candidates.length][target + 1];

		for (int i = 0; i < candidates.length; i++) {
			for (int j = 0; j < target + 1; j++) {
				number_of_ways[i][j] = new ResultSet();
			}
		}

		for (int i = 0; i < candidates.length; i++) {
			ResultSet rs = new ResultSet();
			rs.add(new ArrayList());
			number_of_ways[i][0] = rs;
		}

		for (int j = 1; j < target + 1; j++) {
			int num = j / candidates[0];
			ArrayList<Integer> temp = new ArrayList<Integer>();
			if (j % candidates[0] == 0) {
				for (int t = 0; t < num; t++) {
					temp.add(candidates[0]);
				}
				number_of_ways[0][j].add(temp);
			}
		}

		for (int i = 1; i < candidates.length; i++) {
			for (int j = 1; j < target + 1; j++) {
				for (int k = 0; k * candidates[i] <= j; k++) {
					ResultSet temp = new ResultSet(number_of_ways[i - 1][j - k
							* candidates[i]]);
					for (int t = 0; t < temp.data.size(); t++) {
						ArrayList<Integer> sol = (ArrayList<Integer>) temp.data
								.get(t).clone();
						for (int s = 0; s < k; s++)
							sol.add(candidates[i]);
						number_of_ways[i][j].add(sol);
					}
				}
			}
		}

		return number_of_ways[candidates.length - 1][target].data;

	}
}

class ResultSet {
	ArrayList<ArrayList<Integer>> data = new ArrayList<ArrayList<Integer>>();

	void add(ArrayList<Integer> data) {
		this.data.add(data);
	}

	void add(ResultSet set) {
		for (int i = 0; i < set.data.size(); i++) {
			this.data.add((ArrayList<Integer>) (set.data.get(i).clone()));
		}

	}

	public ResultSet(ResultSet rs) {
		for (int i = 0; i < rs.data.size(); i++) {
			this.data.add((ArrayList<Integer>) (rs.data.get(i).clone()));
		}
	}

	public ResultSet() {
	}

}
