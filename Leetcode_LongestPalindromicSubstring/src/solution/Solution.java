package solution;

public class Solution {
	public String longestPalindrome(String s) {
        if(s == null || s.length() == 0){
        	return s;
        }
        
        String max = s.substring(0, 1);
        
        for(int i = 0; i < s.length(); i++){
        	int count = 1;
        	
        	while(i - count >= 0 && 
        			i + count < s.length() && 
        			s.charAt(i - count) == s.charAt(i + count)){
        		count++;
        	}
        	
        	count --;
        	
        	if(count * 2 + 1 > max.length()){
        		max = s.substring(i - count, i + count + 1);
        	}
        	
        	count = 1;
        	while(i - count + 1 >= 0 && 
        			i + count < s.length() && 
        			s.charAt(i - count + 1) == s.charAt(i + count)){
        		count++;
        	}
        	count --;
        	
        	if(count * 2 > max.length()){
        		max = s.substring(i - count + 1, i + count + 1);
        	}
        }
        
        return max;
    }
}
