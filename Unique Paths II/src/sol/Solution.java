package sol;

public class Solution {

	/**
	 * Follow up for "Unique Paths":
	 * Now consider if some obstacles are added to the grids. 
	 * How many unique paths would there be?
	 * An obstacle and empty space is marked as 1 and 0 respectively 
	 * in the grid.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] A = {{0}};
		System.out.print(new Solution().uniquePathsWithObstacles(A));

	}
	
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        // Start typing your Java solution below
        // DO NOT write main() function
		if(obstacleGrid == null || obstacleGrid.length == 0 
				|| obstacleGrid[0].length == 0){
			return 1;
		}		
		
		int [][] paths = new int[obstacleGrid.length][obstacleGrid[0].length];  
        
		if(obstacleGrid[0][0] == 0)
			paths[0][0] = 1;
		else
			paths[0][0] = 0;
		
        for(int i = 1;i < paths.length; i++){
        	if(obstacleGrid[i][0] == 0){
        		paths[i][0] = paths[i-1][0];
        	}
        	else{
        		paths[i][0] = 0;
        	}
        }
        	
        
        for(int j = 1;j < paths[0].length; j++){
        	if(obstacleGrid[0][j] == 0){
        		paths[0][j] = paths[0][j-1];
        	}
        	else{
        		paths[0][j] = 0;
        	}
        }
        	       
        
        for(int i = 1;i < paths.length; i++){
        	for(int j = 1; j < paths[0].length; j++){
        		if(obstacleGrid[i][j] == 0){
        			paths[i][j] = paths[i-1][j]+paths[i][j-1];
        		}
        		else{
        			paths[i][j] = 0;
        		}
        	}
        }
        
        return paths[paths.length-1][paths[0].length-1];
    }

}
