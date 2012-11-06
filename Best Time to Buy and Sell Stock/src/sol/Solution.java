package sol;

public class Solution {

	/**
	 * Given an array of strings, return all groups of strings that are anagrams.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] A = {2,1,4};
		System.out.print(new Solution().maxProfit(A));

	}
	public int maxProfit(int[] prices) {
        // Start typing your Java solution below
        // DO NOT write main() function
		
		if(prices == null || prices.length == 0)
			return 0;
		
		int maxprofit = 0;
		int lowest_before = Integer.MAX_VALUE;
		
		for(int i = 0; i < prices.length; i++){
			if(lowest_before > prices[i])
				lowest_before = prices[i];
			else if(prices[i] - lowest_before > maxprofit){
				maxprofit = prices[i] - lowest_before;
			}
			
		}
		
		return maxprofit;
        
    }
	

}
