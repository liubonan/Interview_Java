package sol;

public class Solution {

	/**
	 * Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.
	 * 
	 * The Sudoku board could be partially filled, where empty cells are filled
	 * with the character '.'.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] strs = {"53..7....","6..195...",".98....6.",
						  "8...6...3","4..8.3..1","7...2...6",
						  ".6....28.","...419..5","....8..79"};
		char[][] board = new char [9][9];
		int i = 0;
		for(String s: strs){
			board[i] = s.toCharArray();
			i++;
		}
		
		System.out.println(new Solution().isValidSudoku(board));
	}
	
	public boolean isValidSudoku(char[][] board) {
        // Start typing your Java solution below
        // DO NOT write main() function
		if(board.length == 0)
			return false;
		
		boolean [] checker = new boolean[10];
		
		for(int ii = 0; ii < 10; ii++)
			checker[ii] = false;
		
		for(int i = 0; i < board.length;i++){
			for(int j = 0; j < board.length;j++){
				if (board[i][j] != '.') {
					if (checker[board[i][j]-'0']) {
						return false;
					} else {
						checker[board[i][j]-'0'] = true;
					}
				}
			}
			
			for(int ii = 0; ii < 10; ii++)
				checker[ii] = false;
			
		}
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (board[j][i] != '.') {
					if (checker[board[j][i]-'0']) {
						return false;
					} else {
						checker[board[j][i]-'0'] = true;
					}
				}
			}

			for(int ii = 0; ii < 10; ii++)
				checker[ii] = false;

		}
		
		for (int s = 0; s < board.length; s += 3) {
			for (int k = 0; k < board.length; k += 3) {
				for (int i = s; i < s + 3; i++) {
					for (int j = k; j < k + 3; j++) {
						if (board[i][j] != '.') {
							if (checker[board[i][j]-'0']) {
								return false;
							} else {
								checker[board[i][j]-'0'] = true;
							}
						}
					}
				}
				for(int ii = 0; ii < 10; ii++)
					checker[ii] = false;
			}
		}
		
		return true;
        
    }

}
