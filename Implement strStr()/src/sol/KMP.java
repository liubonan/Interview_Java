package sol;

public class KMP {

	/**
	 * Returns a pointer to the first occurrence of needle in haystack, or null
	 * if needle is not part of haystack.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new KMP().strStr("eeeeabcdeeee","abcd"));
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
        
        return null;
    }

}
