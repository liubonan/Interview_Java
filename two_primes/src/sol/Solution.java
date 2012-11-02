package sol;

public class Solution {
	
	public static int f(int k){
		int [] primes = new int[k+1];		
		
		for(int i = 0;i < primes.length; ++i){
			primes[i] = 0;
		}
		
		primes[0] = -1;
		primes[1] = -1;
		
		for(int i = 0; i < Math.pow(primes.length,0.5); ++i){
			if(primes[i] != -1){
				for(int j = i*2; j < primes.length; j += i){
					primes[j] = -1;
				}
			}
		}
		

		
		for(int i = 0;i < primes.length / 2; ++i){
			if(primes[i] == 0){
				int other = k - i;
				if(primes[other] == 0){
					return i;
				}				
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args){
		
		System.out.println(f(12));
	}

}
