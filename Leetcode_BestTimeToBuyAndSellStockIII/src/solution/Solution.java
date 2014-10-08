package solution;

public class Solution {
	public int maxProfit(int[] prices) {
        if(prices == null || prices.length < 2){
        	return 0;
        }
        
        int[] profit = new int[prices.length];
        int[] profitRight = new int[prices.length];
        
        profit[0] = 0;
        int low = prices[0];
        int max = Integer.MIN_VALUE;
        
        for(int i = 1; i < prices.length; i ++){
        	max = Math.max(max, prices[i] - low);
        	profit[i] = Math.max(0, max);
        	low = Math.min(low, prices[i]);
        }
        
        max = Integer.MIN_VALUE;
        int high = prices[prices.length - 1];
        for(int i = prices.length - 2; i >= 0; i--){
        	max = Math.max(high - prices[i], max);
        	profitRight[i] = Math.max(0, max);
        	high = Math.max(high, prices[i]);
        }
        
        int maxProfit = profitRight[0];
        
        for(int i = 0; i < prices.length - 1; i++){
        	maxProfit = Math.max(maxProfit, profit[i] + profitRight[i + 1]);
        }
        
        maxProfit = Math.max(maxProfit, profit[prices.length - 1]);
        
        return maxProfit;
    }
}
