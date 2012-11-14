package sol;

import java.util.ArrayList;

public class Solution {

	/**
	 * Given a triangle, find the minimum path sum from top to bottom. Each step
	 * you may move to adjacent numbers on the row below.	 * 
	 * For example, given the following triangle 
	 * [ 
	 *   [2], 
	 *  [3,4], 
	 * [6,5,7],
	 *[4,1,8,3] 
	 * ] 	  
	 * The minimum path sum from top to bottom is 11 (i.e., 2 + 3 +
	 * 5 + 1 = 11).
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> A1 = new ArrayList<Integer>();
		A1.add(-1);
		A.add(A1);
		ArrayList<Integer> A2 = new ArrayList<Integer>();
		A2.add(3);
		A2.add(2);
		A.add(A2);
		ArrayList<Integer> A3 = new ArrayList<Integer>();
		A3.add(1);
		A3.add(-2);
		A3.add(-1);
		A.add(A3);
		System.out.println(new Solution().minimumTotal(A));
	}
	
	public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(triangle == null || triangle.isEmpty())
        	return Integer.MIN_VALUE;
        if(triangle.size() == 1)
        	return triangle.get(0).get(0);
        int min = Integer.MAX_VALUE;
        for(int i = 1; i < triangle.size();i++){
        	
        	//int n = triangle.size();
        	int head = triangle.get(i-1).get(0)+triangle.get(i).get(0);
        	int tail = triangle.get(i-1).get(i-1)+triangle.get(i).get(i);
        	triangle.get(i).set(0, head);
        	triangle.get(i).set(i, tail);

        	min = Math.min(head, tail);
        	for(int j = 1; j < i+1-1; j++){
        		int value = triangle.get(i).get(j)+Math.min(triangle.get(i-1).get(j), triangle.get(i-1).get(j-1));
        		triangle.get(i).set(j, value);
        		if(value < min)
        			min = value;
        	}
        }
        return min;
    }

}
