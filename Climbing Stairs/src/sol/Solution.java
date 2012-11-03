package sol;

public class Solution {

	/**
	 * You are climbing a stair case. It takes n steps to reach to the top.
	 * Each time you can either climb 1 or 2 steps. In how many distinct 
	 * ways can you climb to the top?
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Solution().climbStairs(10));

	}
	
	public int climbStairs(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
		
		int[] ways = new int [n+1];
		
		ways[0] = 1;
		ways[1] = 1;
		
		for(int i = 2; i < n+1; i++){
			ways[i] = ways[i-1]+ways[i-2];
		}
		
		return ways[n];
        
    }

}
