package solution;

public class Solution {
	public int divide(int dividend, int divisor) {
        
        int sign = (dividend > 0 && divisor > 0) || (dividend < 0 && divisor < 0) ? 1 : -1;
        
        long dividendLong = Math.abs((long)dividend);
        long divisorLong = Math.abs((long)divisor);
        
        int result = 0;
        while(dividendLong > divisorLong){
            int shift = 0;
            while(dividendLong >= (divisorLong << (shift + 1))){
            	shift++;
            }
            result += (1 << shift);
            dividendLong -= (divisorLong << shift);
        }
        
        return result * sign;
    }
}
