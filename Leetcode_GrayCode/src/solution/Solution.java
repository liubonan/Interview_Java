package solution;

import java.util.*;

public class Solution {
	public List<Integer> grayCode(int n) {
        ArrayList<Integer> result = new ArrayList<Integer>();
		
        result.add(0);
		for(int i = 0; i < n; i++){
			int size = result.size();
			for(int j = size - 1; j >= 0; j--){
				int curr = result.get(j);
				curr = curr | (1 << i);
				result.add(curr);
			}
		}
		
		return result;
    }
}
