package solution;

public class Solution {
	public int numDecodings(String s) {
        if(s == null || s.length() == 0){
        	return 0;
        }
        
        int[] ways = new int[s.length()];
        
        ways[0] = s.charAt(0) == '0' ? 0 : 1;
        
        for(int i = 1; i < ways.length; i++){
        	if(s.charAt(i) == '0'){
        		ways[i] = 0;
        	}
        	else{
        		ways[i] = ways[i - 1];
        	}
        	
        	if(s.charAt(i - 1) != '0' && 
        			Integer.valueOf(s.substring(i - 1, i + 1)) <= 26){
        		
        		ways[i] += i == 1 ? 1 : ways[i - 2];
        	}
        }
        
        return ways[ways.length - 1];
    }
}
