package solution;

import java.util.Arrays;

public class Solution {
	public boolean isValidSudoku(char[][] board) {
        if(board == null || board.length == 0 || board[0].length == 0){
        	return false;
        }
        
        boolean[] flag = new boolean[9];
        
        for(int i = 0; i < 9; i++){
        	Arrays.fill(flag, false);
        	for(int j = 0; j < 9; j++){
        		if(!mark(flag, board[i][j])){
        			return false;
        		}
        	}
        }
        
        for(int i = 0; i < 9; i++){
        	Arrays.fill(flag, false);
        	for(int j = 0; j < 9; j++){
        		if(!mark(flag, board[j][i])){
        			return false;
        		}
        	}
        }
        
        for(int i = 0; i < 9; i += 3){
        	for(int j = 0; j < 9; j += 3){
        		if(!markSquare(flag, board, i, j)){
        			return false;
        		}
        	}
        }
        
        return true;
    }
	
	private boolean markSquare(boolean[] flag, char[][] board, int iStart, int jStart){
		Arrays.fill(flag, false);
		for(int i = iStart; i < iStart + 3; i++){
			for(int j = jStart; j < jStart + 3; j++){
				if(!mark(flag, board[i][j])){
					return false;
				}
			}
		}
		
		return true;
	}
	
	private boolean mark(boolean[] flag, char c){
		if(Character.isDigit(c)){
			if(c == '0' || flag[c - '0' - 1]){
				return false;
			}
			else{
				flag[c - '0' - 1] = true;
			}
		}
		
		return true;
	}
}
