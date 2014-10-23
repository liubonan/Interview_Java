package solution;

import java.util.Arrays;

public class Solution {
	public void solveSudoku(char[][] board) {
        if(board == null){
        	return;
        }
        
        this.search(board, 0);
    }
	
	private boolean search(char[][] board, int pos) {
		int i = pos / 9;
		int j = pos % 9;
		
		if(pos == 81){
			return true;
		}
		
		if (board[i][j] == '.') {
			for (char k = '1'; k <= '9'; k++) {
				board[i][j] = k;
				if (this.valid(board, i, j)) {
					if (this.search(board, pos + 1)) {
						return true;
					}
				}
			}
			board[i][j] = '.';
			return false;
		}else{
			return this.search(board, pos + 1);
		}
	}
	
	private boolean valid(char[][] board, int m, int n){
		
		boolean[] flag = new boolean[9];
		Arrays.fill(flag, false);
		

		Arrays.fill(flag, false);
		for (int j = 0; j < 9; j++) {
			if (board[m][j] == '.') {
				continue;
			}

			if (flag[board[m][j] - '1']) {
				return false;
			} else {
				flag[board[m][j] - '1'] = true;
			}
		}

		Arrays.fill(flag, false);
		for (int i = 0; i < 9; i++) {
			if (board[i][n] == '.') {
				continue;
			}

			if (flag[board[i][n] - '1']) {
				return false;
			} else {
				flag[board[i][n] - '1'] = true;
			}
		}
		
		int top = (m / 3) * 3;
		int left = (n / 3) * 3;

		Arrays.fill(flag, false);
		for(int i = top; i < top + 3; i++){
			for(int j = left; j < left + 3; j++){
				if(board[i][j] == '.'){
					continue;
				}
				
				if(flag[board[i][j] - '1']){
					return false;
				}
				else{
					flag[board[i][j] - '1'] = true;
				}
			}
		}
		
		return true;
	}
}
