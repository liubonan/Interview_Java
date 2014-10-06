package solution;

import java.util.*;

public class Solution {
	public List<Integer> getRow(int rowIndex) {
		Integer[] result = new Integer[rowIndex + 1];
		Integer[] prev = new Integer[rowIndex + 1];
		
		for(int i = 0; i < rowIndex + 1; i++){
			result[0] = 1;
			
			for(int j = 1; j < i; j++){
				result[j] = prev[j - 1] + prev[j];
			}
			
			result[i] = 1;
			
			for(int s = 0; s < result.length; s++){
				prev[s] = result[s];
			}
		}
		
		return Arrays.asList(result);
    }
}
