package sol;

public class Solution {

	/**
	 * Say you have an array for which the ith element is the price of a given
	 * stock on day i.
	 * 
	 * Design an algorithm to find the maximum profit. You may complete as many
	 * transactions as you like (ie, buy one and sell one share of the stock
	 * multiple times). However, you may not engage in multiple transactions at
	 * the same time (ie, you must sell the stock before you buy again).
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] A = {2,1,4,2,1,4};
		System.out.print(new Solution().maxProfit(A));

	}
	
	public int maxProfit(int[] prices) {
        // Start typing your Java solution below
        // DO NOT write main() function
		if(prices == null || prices.length == 0 || prices.length == 1)
			return 0;
		
		int maxprofit = 0;
		int lowest_before = Integer.MAX_VALUE;
		int highest_before = Integer.MIN_VALUE;
		
		for(int i = 0; i < prices.length-1; i++){
			if(prices[i+1] > prices[i]){
				if(lowest_before == Integer.MAX_VALUE)
					lowest_before = prices[i];
				
			}
			else if(prices[i+1] < prices[i]){
				if(lowest_before != Integer.MAX_VALUE){
					highest_before = prices[i];					
					maxprofit+=(highest_before - lowest_before);
					lowest_before = Integer.MAX_VALUE;
					highest_before = Integer.MIN_VALUE;
				}
					
			}
			
		}
		
		if(prices[prices.length-1] > prices[prices.length-2]){
			maxprofit += (prices[prices.length-1] - lowest_before);
		}
		else if(prices[prices.length-1] == prices[prices.length-2] && lowest_before != Integer.MAX_VALUE){
			maxprofit += (prices[prices.length-1] - lowest_before);
		}
		
		return maxprofit;
    }

}
