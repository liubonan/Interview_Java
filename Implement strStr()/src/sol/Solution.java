package sol;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Solution().strStr("mississippi","issipi"));
	}
	
	public String strStr(String haystack, String needle) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(haystack.isEmpty() && needle.isEmpty())
        	return "";
		if(haystack == null || haystack.isEmpty())
        	return null;
        if(needle == null || needle.isEmpty())
        	return haystack;
        if(haystack.length() < needle.length())
        	return null;
        for(int i = 0; i < haystack.length()-needle.length()+1;i++){
        	int same = 0;
        	for(int j = 0; j < needle.length(); j++){
        		if(haystack.charAt(i+j) != needle.charAt(j)){
        			break;
        		}
        		else{
        			same++;
        		}
        	}
        	if(same == needle.length())
        		return haystack.substring(i);
        }
        return null;
    }

}
