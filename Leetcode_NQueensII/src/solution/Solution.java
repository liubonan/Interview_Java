package solution;

import java.util.*;

public class Solution {
	private int count = 0;
	
	public int totalNQueens(int n) {
        if(n == 0){
        	return 0;
        }
        
        Integer[] board = new Integer[n];
        Arrays.fill(board, -1);
        
        this.search(board, 0, n);
        
        return this.count;
    }

	private void search(Integer[] result, int index, int n){
		if(!this.isValidState(result)){
			return;
		}
		
		if(index == n){
			this.count++;
		}
		else{
			for(int i = 0; i < n; i++){
				result[index] = i;
				this.search(result, index + 1, n);
				result[index] = -1;
			}
		}
	}
	
	private boolean isValidState(Integer[] pos){
		
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i = 0; i < pos.length; i++){
			if(pos[i] == -1){
				continue;
			}
			
			if(set.contains(pos[i])){
				return false;
			}
			
			set.add(pos[i]);
		}
		
		set.clear();
		for(int i = 0; i < pos.length; i++){
			if(pos[i] == -1){
				continue;
			}
			
			if(set.contains(pos[i] + i)){
				return false;
			}
			
			set.add(pos[i] + i);
		}
		
		set.clear();
		for(int i = 0; i < pos.length; i++){
			if(pos[i] == -1){
				continue;
			}
			
			if(set.contains(pos[i] - i)){
				return false;
			}
			
			set.add(pos[i] - i);
		}
		
		return true;
	}
}
