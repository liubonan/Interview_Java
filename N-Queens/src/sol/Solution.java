package sol;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {

	/**
	 * The n-queens puzzle is the problem of placing n queens on an n×n
	 * chessboard such that no two queens attack each other.Given an integer n,
	 * return all distinct solutions to the n-queens puzzle.
	 * 
	 * Each solution contains a distinct board configuration of the n-queens'
	 * placement, where 'Q' and '.' both indicate a queen and an empty space
	 * respectively.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String[]> r= new Solution().solveNQueens(11);
		//System.out.print(r.size());
		for(String[] s : r){
			for(String str : s)
				System.out.println(str);
			System.out.println("==========");
		}
	}
	
	public ArrayList<String[]> solveNQueens(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
		Queue<Status> q = new LinkedList<Status>();
		ArrayList<String[]> result = new ArrayList<String[]>();
		
		Status init = new Status(n);
		
		q.add(init);
		
		while(!q.isEmpty()){
			Status curr = q.remove();
			if(curr.depth == n-1){
				String[] res = new String[n];
				for(int i = 0; i < n; i++)
					res[i] = new String(curr.data[i]);
				result.add(res);
			}
			else{
				for(int i = 0; i < n;i++){
					Status nstatus = new Status(curr);
					nstatus.data[i][curr.depth+1] = 'Q';
					if(check(nstatus.data,i,curr.depth+1,n)){
						nstatus.depth++;
						q.add(nstatus);
					}
				}
			}			
		}
		
		return result;
		
        
    }
	
	public boolean check(char[][] s,int row, int col,int n){
		for(int i = 0;i < col;i++){
			if(s[row][i] == 'Q')
				return false;
		}
		
		int run_i = row-1, run_j = col-1;
		
		while(run_i >=0 && run_j >=0){
			if(s[run_i][run_j] == 'Q')
				return false;
			run_i--;
			run_j--;
		}
		
		run_i = row+1;
		run_j = col-1;
		
		while(run_i <n && run_j >=0){
			if(s[run_i][run_j] == 'Q')
				return false;
			run_i++;
			run_j--;
		}
		
		return true;
	}
	
	

}

class Status{
	char[][] data;
	int depth=-1;
	
	public Status(int n){
		this.data = new char[n][n];
		for(int i = 0;i < n;i++)
			for(int j = 0; j < n;j++)
				this.data[i][j] = '.';
	}
	
	public Status(Status s){
		this.data = new char[s.data.length][s.data.length];
		for(int i = 0;i < s.data.length;i++)
			for(int j = 0; j < s.data.length;j++)
				this.data[i][j] = s.data[i][j];
		this.depth = s.depth;
	}
}
