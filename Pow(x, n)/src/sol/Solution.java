package sol;

public class Solution {

	/**
	 * Implement pow(x, n).
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Solution().pow(2.0,10));

	}
	
	public double pow(double x, int n) {
		// Start typing your Java solution below
		// DO NOT write main() function
		boolean neg = false;
		
		if((x == 0 && n == 0) || (x == 1)){
			return 1;
		}
		else if(x == 0){
			return 0;
		}
		else if (x > 0){
			neg = false;
		}
		else{
			if(n % 2 == 0){
				return pow(x*(-1),n);
			}
			else{
				return (-1)* pow(x*(-1),n);
			}
		}
		
		
		if(n == 0){
			return 1;
		}
		else if(n == 1){
			return x;
		}
		else if (n > 0){
			if( n % 2 == 0){
				double temp = pow(x, n/2);
				return temp * temp;
			}
			else{
				double temp = pow(x, (n-1)/2);
				return temp * temp * x;
			}
		}
		else{
			double temp = pow(x, n*(-1));
			return 1.0 / temp;
		}
		
		
		
	}

}
