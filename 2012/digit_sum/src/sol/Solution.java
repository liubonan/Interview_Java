package sol;

import java.util.HashMap;

public class Solution {
	
	public static int digit_sum(int k){
		int sum = 0;
		while(k != 0){
			int r = k % 10;
			k = (int)(k / 10);
			sum += r;
		}
		return sum;
	}
	
	public static int max_possible_sum(int k){
		int num_digit = 0;
		while(k != 0){
			k = (int) (k / 10);
			++num_digit;
		}
		return num_digit*9;
	}
	
	public static int f(int k){
		int [] sums = new int [max_possible_sum(k)];
		int common_sum = 0;
		
		for(int i = 0; i < sums.length; ++i){
			sums[i] = 0;
		}
		
		for(int i = 0; i <= k; ++i){
			int sum = digit_sum(i);
			++sums[sum];
			if(sums[sum] > common_sum){
				common_sum = sums[sum];
			}
		}
		
		return common_sum;		
	}	
	
	public static void main(String [] agrs){
		System.out.println(f(7777));
	}

}
