package solution;

import java.util.*;

public class Solution {
	public List<String[]> solveNQueens(int n) {
        List<Integer[]> results = new LinkedList<Integer[]>();
        if(n == 0){
        	return this.printBoard(results);
        }
        
        Integer[] board = new Integer[n];
        Arrays.fill(board, -1);
        
        this.search(results, board, 0, n);
        
        return this.printBoard(results);
    }

	private void search(List<Integer[]> results, Integer[] result, int index, int n){
		if(!this.isValidState(result)){
			return;
		}
		
		if(index == n){
			Integer[] currResult = new Integer[result.length];
			for(int i = 0; i < result.length; i++){
				currResult[i] = result[i];
			}
			results.add(currResult);
		}
		else{
			for(int i = 0; i < n; i++){
				result[index] = i;
				this.search(results, result, index + 1, n);
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
	
	private List<String[]> printBoard(List<Integer[]> board){
		List<String[]> results = new LinkedList<String[]>();
		if(board == null || board.size() == 0){
			return results;
		}
		
		for(Integer[] curr : board){
			String[] output = new String[curr.length];
			
			for(int i = 0; i < curr.length; i++){
				StringBuilder sb= new StringBuilder();
				for(int j = 0; j < curr.length; j++){
					sb.append(curr[i] == j ? "Q" : ".");
				}
				output[i] = sb.toString();
			}
			
			results.add(output);
		}
		
		return results;
	}
}
