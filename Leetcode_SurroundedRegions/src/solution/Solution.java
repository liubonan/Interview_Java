package solution;

import java.util.*;

public class Solution {
	public void solve(char[][] board) {
        if(board == null || board.length == 0 || board[0].length == 0){
        	return;
        }
        
        Queue<int[]> queue = new LinkedList<int[]>();
        
        for(int i = 0; i < board[0].length; i++){
        	if(board[0][i] == 'O'){
        		queue.offer(new int[] {0,i});
        	}
        	
        	if(board[board.length- 1][i] == 'O'){
        		queue.offer(new int[] {board.length- 1,i});
        	}
        }
        
        for(int i = 0; i < board.length; i++){
        	if(board[i][0] == 'O'){
        		queue.offer(new int[] {i , 0});
        	}
        	
        	if(board[i][board[0].length- 1] == 'O'){
        		queue.offer(new int[] {i, board[0].length- 1});
        	}
        }
        
        while(!queue.isEmpty()){
        	int[] cur= queue.poll();
        	board[cur[0]][cur[1]] = 'W';
        	
        	if(cur[0] - 1 >= 0 && board[cur[0] - 1][cur[1]] == 'O'){
        		queue.add(new int[] {cur[0] - 1, cur[1]});
        	}
        	
        	if(cur[1] - 1 >= 0 && board[cur[0]][cur[1] - 1] == 'O'){
        		queue.add(new int[] {cur[0], cur[1] - 1});
        	}
        	
        	if(cur[0] + 1 < board.length && board[cur[0] + 1][cur[1]] == 'O'){
        		queue.add(new int[] {cur[0] + 1, cur[1]});
        	}
        	
        	if(cur[1] + 1 < board[0].length && board[cur[0]][cur[1] + 1] == 'O'){
        		queue.add(new int[] {cur[0], cur[1] + 1});
        	}
        }
        
        this.adjust(board, 'O', 'X');
        this.adjust(board, 'W', 'O');
    }
	
	private void adjust(char[][] board, char oldChar, char newChar){
		for(int i = 0; i < board.length; i++){
			for(int j = 0; j < board[0].length; j++){
				if(board[i][j] == oldChar){
					board[i][j] = newChar;
				}
			}
		}
	}
}
