package solution;

public class Solution {
	public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0){
        	return "";
        }
        
        String prefix = strs[0];
        
        for(String str : strs){
        	int pos = 0;
        	while(pos < prefix.length() 
        			&& pos < str.length() && 
        			str.charAt(pos) == prefix.charAt(pos)){
        		pos++;
        	}
        	
        	prefix = prefix.substring(0, pos);
        }
        
        return prefix;
    }
}
