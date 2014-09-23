package solution;

import java.util.Arrays;

public class Solution {
	public int[] plusOne(int[] digits) {
        if(digits == null){
        	return null;
        }
        
        int carry = 1;
        
        for(int i = digits.length - 1; i >= 0; i--){
        	int digit = digits[i];
        	digits[i] = (digit + carry) % 10;
        	carry = (digit + carry) / 10;
        }
        
        if(carry == 0){
        	return digits;
        }
        else{
        	int[] result = new int[digits.length + 1];
        	int j = 1;
        	for(int i : digits){
        		result[j++] = i;
        	}
        	
        	result[0] = carry;
        	
        	return result;
        }
    }
}
