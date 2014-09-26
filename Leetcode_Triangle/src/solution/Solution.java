package solution;

import java.util.List;

public class Solution {
	public int minimumTotal(List<List<Integer>> triangle) {
		
		if(triangle == null || triangle.size() == 0){
			return 0;
		}
		
		int[][] sum = new int[triangle.size()][triangle.size()];
		for(int i = 0; i < triangle.size(); i++){
			sum[triangle.size() - 1][i] = triangle.get(triangle.size() - 1).get(i);
		}
        
		for(int i = triangle.size() - 2; i >= 0; i--){
			for(int j = 0; j <= i; j ++){
				sum[i][j] = triangle.get(i).get(j) + Math.min(sum[i + 1][j], sum[i + 1][j + 1]);
			}
		}
		
		return sum[0][0];
    }
}
