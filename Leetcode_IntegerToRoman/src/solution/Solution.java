package solution;

public class Solution {
	public String intToRoman(int num) {
        if(num <= 0 || num > 3999){
        	return null;
        }
        
        String[][] romanChar = new String[][]{
        		{"I", "V", "X"},
        		{"X", "L", "C"},
        		{"C", "D", "M"}
        };
        
        StringBuilder sb = new StringBuilder();
        
        int divisor = 1000;
        int digit = num / divisor;
        
        while(digit != 0){
        	sb.append("M");
        	digit --;
        }
        
        num %= divisor;
    	divisor /= 10;
        
        while(divisor != 0){
        	int digitIndex = (int)Math.log10(divisor);
        	digit = num / divisor;
        	
        	if(digit == 9){
        		sb.append(romanChar[digitIndex][0]);
        		sb.append(romanChar[digitIndex][2]);
        	}
        	else if(digit >= 5){
        		sb.append(romanChar[digitIndex][1]);
        		while(digit != 5){
                	sb.append(romanChar[digitIndex][0]);
                	digit --;
                }
        	}
        	else if(digit == 4){
        		sb.append(romanChar[digitIndex][0]);
        		sb.append(romanChar[digitIndex][1]);
        	}
        	else{
        		while(digit != 0){
                	sb.append(romanChar[digitIndex][0]);
                	digit --;
                }
        	}
        	
        	num %= divisor;
        	divisor /= 10;
        }
        
        return sb.toString();
        
    }
}
