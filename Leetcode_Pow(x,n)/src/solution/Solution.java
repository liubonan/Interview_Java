package solution;

public class Solution {
	public double pow(double x, int n){
		if(n == 0){
			return 1;
		}
		
		if(n == 1){
			return x;
		}
		
		int k = n < 0 ? n * (-1) : n;
		double result;
		
		if(k % 2 == 0){
			double s = pow (x, k/2);
			result = s * s;
		}
		else{
			double s = pow(x, (k - 1)/2);
			result = s * s * x;
		}
		
		return n < 0 ? 1 / result : result;
	}
	
	
// DP solution
//	public double pow(double x, int n) {
//
//		if (n == 0) {
//			return 1;
//		}
//		
//		int length = n < 0 ? n *(-1) : n;
//
//		double[] results = new double[length + 1];
//
//		results[0] = 1;
//		results[1] = x;
//
//		for (int i = 2; i < results.length; i++) {
//
//			if (i % 2 == 0) {
//				int k = i / 2;
//				results[i] = results[k] * results[k];
//			} else {
//				int k = (i - 1) / 2;
//				results[i] = results[k] * results[k] * x;
//			}
//		}
//
//		return n < 0 ? 1 / results[n * (-1)] : results[n];
//	}
}
