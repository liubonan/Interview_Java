package solution;

public class Solution {

	public String reverseWords(String s) {
        if(s == null){
        	return null;
        }

        char[] sb = new char[s.length()];
        for(int i = s.length() - 1; i >= 0; i--){
        	sb[s.length() - i - 1] = s.charAt(i);
        }
        
        int j = 0;
        for(int i = 0; i < s.length(); i++){
        	if(sb[i] == ' '){
        		this.invertSingleWord(sb, j, i-1);
        		j = i + 1;
        	}
        	else if(i == s.length() - 1){
        		this.invertSingleWord(sb, j, i);
        	}
        }
        
        StringBuffer str = new StringBuffer();
        
        boolean needSpace = false;
        int i = 0;
        
        while(i < sb.length && sb[i] == ' '){
        	i++;
        }
        
        for(; i < sb.length; i++){
        	char c = sb[i];
        	if(c == ' '){
        		needSpace = true;
        	}
        	else{
        		if(needSpace){
        			str.append(' ');
        			needSpace = false;
        		}
        		str.append(c);
        	}
        }
        
        return str.toString();
    }
	
	private char[] invertSingleWord(char[] s, int i, int j){
		while(i < j){
			char temp = s[i];
			s[i] = s[j];
			s[j] = temp;
			i++;
			j--;
		}
		
		return s;
	}
}
