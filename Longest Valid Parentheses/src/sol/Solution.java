package sol;

public class Solution {

	/**
	 * Given a string containing just the characters '(' and ')', find 
	 * the length of the longest valid (well-formed) parentheses substring.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(new Solution().longestValidParentheses(")()())"));

	}
	
	public int longestValidParentheses(String s) {
		// Start typing your Java solution below
		// DO NOT write main() function
		int max = 0;
		int left = 0;
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				left++;
				count++;
			}
			if (s.charAt(i) == ')') {
				left--;
				count++;
			}
			if (left == 0) {
				max = Math.max(max, count);
			}
			if (left < 0) {
				count = 0;
				left = 0;
			}
		}
		
		count = 0;
    	int right = 0;
		
		for (int i = s.length()-1; i >= 0; i--) {
			if (s.charAt(i) == ')') {
				right++;
				count++;
			}
			if (s.charAt(i) == '(') {
				right--;
				count++;
			}
			if (right == 0) {
				max = Math.max(max, count);
			}
			if (right < 0) {
				count = 0;
				right = 0;
			}
		}

		return max;
	}

}
