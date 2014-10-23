package solution;

public class Solution {
	public int candy(int[] ratings) {
        if(ratings == null){
        	return 0;
        }
        
        int[] candy = new int[ratings.length];
        candy[0] = 1;
        for(int i = 1; i < ratings.length; i++){
        	candy[i] = 1;
        	if(ratings[i] > ratings[i - 1]){
        		candy[i] = candy[i - 1] + 1;
        	}
        }
        
        int sum = candy[candy.length - 1];
        for(int i = ratings.length - 2; i >= 0; i--){
        	if(ratings[i] > ratings[i + 1] && candy[i] <= candy[i + 1]){
        		candy[i] = candy[i + 1] + 1;
        	}
        	sum += candy[i];
        }
        
        return sum;
    }
}
