package solution;

public class Solution {
	public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0){
        	return 0;
        }

        int result = Integer.MIN_VALUE;
        int minPrice = prices[0];
        
        for(int i = 1; i < prices.length; i++){
        	if(prices[i] - minPrice > result){
        		result = prices[i] - minPrice;
        	}
        	
        	if(prices[i] < minPrice){
        		minPrice = prices[i];
        	}
        }
        
        return result > 0? result : 0;
    }
}
