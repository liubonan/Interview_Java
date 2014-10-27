package solution;

public class Solution {
	public boolean isInterleave(String s1, String s2, String s3) {
        if(s1 == null || s2 ==null || s3 == null || s1.length() + s2.length() != s3.length()){
        	return false;
        }
        
        boolean[][][] isInterLeave = new boolean[s1.length() + 1][s2.length() + 1][s3.length() + 1];

        isInterLeave[0][0][0] = true;
        
        for(int i = 1; i < s1.length(); i++){
        	isInterLeave[i][0][0] = false;
        }
        
        for(int i = 1; i < s2.length(); i++){
        	isInterLeave[0][i][0] = false;
        }
        
        for(int i = 1; i < s3.length(); i++){
        	isInterLeave[0][0][i] = false;
        }
        
        for(int i = 1; i < s1.length() + 1; i++){
        	for(int j = 1; j < s2.length() + 1; j++){
        		isInterLeave[i][j][0] = false;
        	}
        }
        
        for(int j = 1; j < s2.length() + 1; j++){
        	for(int k = 1; k < s3.length() + 1; k++){
        		isInterLeave[0][j][k] = isInterLeave[0][j - 1][k - 1] && s2.charAt(j - 1) == s3.charAt(k - 1);
        	}
    	}
        
        for(int i = 1; i < s1.length() + 1; i++){
        	for(int k = 1; k < s3.length() + 1; k++){
        		isInterLeave[i][0][k] = isInterLeave[i - 1][0][k - 1] && s1.charAt(i - 1) == s3.charAt(k - 1);
        	}
    	}
        
        
        for(int i = 1; i < s1.length() + 1; i++){
        	for(int j = 1; j < s2.length() + 1; j++){
        		for(int k = 1; k < s3.length() + 1; k++){
        			isInterLeave[i][j][k] = false;
        			
        			isInterLeave[i][j][k] |= 
        					((s1.charAt(i - 1) == s3.charAt(k - 1)) &&
        							isInterLeave[i - 1][j][k - 1]);
        			isInterLeave[i][j][k] |= 
        					((s2.charAt(j - 1) == s3.charAt(k - 1)) &&
        							isInterLeave[i][j - 1][k - 1]);
        		}
        	}
        }
        
        return isInterLeave[s1.length()][s2.length()][s3.length()];
    }
	
	// Search Approach -- Time Limit Exceed
//	public boolean isInterleave(String s1, String s2, String s3) {
//        if(s1 == null || s2 ==null || s3 == null){
//        	return false;
//        }
//        
//        if(s1.length() == 0){
//        	return s2.equals(s3);
//        }
//        
//        if(s2.length() == 0){
//        	return s1.equals(s3);
//        }
//        
//        return this.search(s1, s2, s3, 0, 0, 0);
//      }
//	
//	private boolean search(String s1, String s2, String s3, int i1, int i2, int i3){
//		if(i3 == s3.length()){
//			return i1 == s1.length() && i2 == s2.length();
//		}
//		
//		boolean result = false;
//		if(i1 < s1.length() && s1.charAt(i1) == s3.charAt(i3)){
//			result |= this.search(s1, s2, s3, i1 + 1, i2, i3 + 1);
//		}
//		
//		if(i2 < s2.length() && s2.charAt(i2) == s3.charAt(i3)){
//			result |= this.search(s1, s2, s3, i1, i2 + 1, i3 + 1);
//		}
//		
//		return result;
//	}
}
