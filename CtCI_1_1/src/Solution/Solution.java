package Solution;

public class Solution {

	public static boolean Solution(String input) {
		if(input == null){
			return false;
		}
		
		// Assumption: only STANDARD ASCII characters here
		int[] flag = new int[128];
		for(int i=0; i< flag.length; i++){
			flag[i] = 0;
		}
		
		for(char c : input.toCharArray()){
			if(flag[c] == 1){
				return true;
			}
			else{
				flag[c] = 1;
			}
		}
		
		return false;
	}
}
