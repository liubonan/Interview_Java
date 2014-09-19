package solution;

public class Solution {
	public String strStr(String haystack, String needle) {
        if(haystack == null || needle == null){
        	return null;
        }
        
        for(int i = 0; i < haystack.length() - needle.length() + 1; i++){
        	boolean match = true;
        	
        	for(int j = 0; j < needle.length(); j++){
        		if(!match){
        			break;
        		}
        		else{
        			if(haystack.charAt(i + j) != needle.charAt(j)){
        				match = false;
        			}
        		}
        	}
        	
        	if(match){
        		return haystack.substring(i);
        	}
        }
        
        return null;
    }
}
