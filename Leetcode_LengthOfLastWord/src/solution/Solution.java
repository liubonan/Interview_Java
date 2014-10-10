package solution;

import java.util.HashSet;
import java.util.Stack;

public class Solution {
	public int lengthOfLastWord(String s) {
        if(s == null || s.length() == 0){
        	return 0;
        }
        
        int i = s.length() - 1;
        int wordLength = 0;
        
        while(i >= 0 && s.charAt(i) == ' '){
        	i--;
        }
        
        while(i >= 0 && s.charAt(i) != ' '){
        	i--;
        	wordLength++;
        }
        
        return wordLength;
    }
}
