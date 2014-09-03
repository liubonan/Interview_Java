package solution;

public class Solution {
	public boolean isPalindrome(String s) {

		if(s == null){
			return false;
		}
		
		if(s.equals("")){
			return true;
		}
		
		int i = 0, j = s.length() - 1;
		
		while(true){
			
			while(i < j && !isAlphanumeric(s.charAt(i))){
				i++;
			}
			
			while(i < j && !isAlphanumeric(s.charAt(j))){
				j--;
			}
			
			if(i > j){
				break;
			}
			else if(!isSameLetter(s.charAt(i), s.charAt(j))){
				return false;
			}
			else{
				i++;
				j--;
				continue;
			}
		}
		
		return true;
	}
	
	private boolean isAlphanumeric(char c){
		return Character.isAlphabetic(c) ||
				(c >= '0' && c <= '9');
	}
	
	private boolean isSameLetter(char a, char b){
		return Character.toLowerCase(a) == Character.toLowerCase(b);
				
	}

}
