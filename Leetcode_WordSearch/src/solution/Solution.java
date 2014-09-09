package solution;

public class Solution {
	public boolean exist(char[][] board, String word) {
		
		if(board == null || board.length == 0 || board[0].length == 0){
			return false;
		}
		
		boolean result = false;
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				result |= this.search(board, i, j, word);
			}
		}
		
		return result;
	}
	
	private boolean search(char[][] board, int i, int j, String word){
		if(word.length() == 0){
			return true;
		}
		
		if(i < 0 || i >= board.length || j < 0 || j >= board[0].length){
			return false;
		}
		
		if(word.charAt(0) != board[i][j]){
			return false;
		}
		
		char[][] nextBoard = new char[board.length][board[0].length];
		
		for (int k = 0; k < board.length; k++)
		{
			nextBoard[k] = (char[]) board[k].clone();
		}
		
		nextBoard[i][j] = '#';
		String nextWord = word.substring(1);
		
		return search(nextBoard, i - 1, j, nextWord) ||
				search(nextBoard, i, j - 1, nextWord) ||
				search(nextBoard, i + 1, j, nextWord) ||
				search(nextBoard, i, j + 1, nextWord);
	}
}
