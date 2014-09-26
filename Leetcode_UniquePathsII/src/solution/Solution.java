package solution;

public class Solution {
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		if(obstacleGrid.length == 0 || obstacleGrid[0].length == 0){
			return 0;
		}
		
		int[][] paths = new int[obstacleGrid.length][obstacleGrid[0].length];
		
		paths[0][0] = obstacleGrid[0][0] == 1 ? 0 : 1;
				
		for(int i = 1; i < obstacleGrid.length; i++){
			if(obstacleGrid[i][0] == 1){
				paths[i][0] = 0;
			}
			else{
				paths[i][0] = paths[i - 1][0];
			}
		}
		
		for(int i = 1; i < obstacleGrid[0].length; i++){
			if(obstacleGrid[0][i] == 1){
				paths[0][i] = 0;
			}
			else{
				paths[0][i] = paths[0][i - 1];
			}
		}
		
		for(int i = 1; i < obstacleGrid.length; i++){
			for(int j = 1; j < obstacleGrid[0].length; j++){
				if(obstacleGrid[i][j] == 1){
					paths[0][i] = 0;
				}
				else{
					paths[i][j] = paths[i - 1][j] + paths[i][j - 1];
				}
			}
		}
		
        return paths[obstacleGrid.length - 1][obstacleGrid[0].length - 1];
    }
}
