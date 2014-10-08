package solution;

public class Solution {
	public int maxProfit(int[] prices) {
        if(prices == null || prices.length < 2){
        	return 0;
        }
        
        int prev = Integer.MAX_VALUE;
        int profit = 0;
        
        if(prices[0] <= prices[1]){
        	prev = prices[0];
        }
        
        for(int i = 1; i < prices.length - 1; i++){
        	if(prices[i] <= prices[i - 1] &&
        			prices[i] < prices[i + 1]){
        		prev = prices[i];
        	}
        	else if(prices[i] > prices[i - 1] &&
        			prices[i] >= prices[i + 1]){
        		profit += prices[i] - prev;
        		prev = Integer.MAX_VALUE;
        	}
        }
        
        if(prices[prices.length - 1] > prices[prices.length - 2]){
        	profit += prices[prices.length - 1] - prev;
        }
        
        return profit;
    }
}
