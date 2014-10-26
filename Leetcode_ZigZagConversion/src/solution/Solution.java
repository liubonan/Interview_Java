package solution;

public class Solution {
	public String convert(String s, int nRows) {
        if(s == null || s.length() <= nRows || nRows == 1){
        	return s;
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < s.length(); i += 2 * nRows - 2){
        	sb.append(s.charAt(i));
        }
        
        for(int k = 1; k < nRows - 1; k++){
        	for(int i = k; i < s.length(); i += 2 * nRows - 2){
            	sb.append(s.charAt(i));
            	int index = i + 2 * (nRows - k - 1);
            	if(index < s.length()){
            		sb.append(s.charAt(index));
            	}
            }
        }
        
        for(int i = nRows - 1; i < s.length(); i += 2 * nRows - 2){
        	sb.append(s.charAt(i));
        }
        
        return sb.toString();
    }
}
