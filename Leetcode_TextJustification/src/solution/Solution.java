package solution;

import java.util.*;

public class Solution {
	public List<String> fullJustify(String[] words, int L) {
        List<String> result = new LinkedList<String>();
        
        if(words == null || words.length == 0){
        	return result;
        }
        
        int i = 0;
        
        while(i < words.length){
        	int j = i + 1;
        	int len = words[i].length();
        	while(j < words.length && len + words[j].length() + (j - i) <= L){
        		len +=  words[j].length();
        		j++;
        	}
        	
        	StringBuilder sb = new StringBuilder();
        	if(j - i == 1){
        		sb.append(words[i]);
        		this.getSpaces(L - len, sb);
        	}else if(j == words.length){
        		for(int k = i; k < j;k++){
        			sb.append(words[k]);
            		this.getSpaces(1, sb);
            	}
        		this.getSpaces(L - sb.length(), sb);
        	}else{
        		int spaces = (L - len) / (j - i - 1);
            	int extra = (L - len) % (j - i - 1);
            	
            	for(int k = i; k < j;k++){
            		if(k == i){
                		sb.append(words[k]);
            		}else{
            			if(extra > 0){
            				sb.append(' ');
            				extra--;
            			}
            			this.getSpaces(spaces, sb);
                		sb.append(words[k]);
            		}
            	}
        	}
        	
        	result.add(sb.toString());
        	i = j;
        }
        
        return result;
    }
	
	private void getSpaces(int i, StringBuilder sb){
		for(int t = 0; t < i; t++){
			sb.append(' ');
		}
	}
}
