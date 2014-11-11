package sol;

/*I use dynamic programming algorithm in the problem. 
 * I construct a table ways[][] where ways[i][j] means the number 
 * of ways to represent the value j with denomination from denomination[0]
 * to denomination[i]. The possible denomination is stored in the array 
 * denomination[]. 
 * 
 * Because we will represent 200 pence, so integer type is enough.
 * 
 * Important information about run time complexity and memory use:
 * If M is the value we need to represent and N is the number of 
 * possible denomination provided(8 in this problem). The run
 * time complexity is O(M*M*N). In this case, it can be represent as 
 * O(64N) = O(N). We need a M*N table so the memory used in
 * this problem is O(M*N).*/


public class Solution {
	
	//possible denomination
	private static int [] denomination = {1,2,5,10,20,50,100,200};	
	
	public static int currency_combination(int value){		
		//error checking
		if(value <= 0)
			return -1;
		
		int [][] number_of_ways = new int [denomination.length][value+1];
		
		//initialize the table
		for(int i = 0; i < denomination.length;i++)
			number_of_ways[i][0] = 1;
		for(int j = 0; j < value+1; j++)
			number_of_ways[0][j] = 1;
		
		//i is the denomination index
		//number_of_ways[i][] means we use denomination from 0 to i
		for(int i = 1; i < denomination.length; i++){
			//j is the value represented
			for(int j = 1; j < value+1; j++){
				//initial element
				number_of_ways[i][j] = 0;
				
				//the ways use 0 to n coins with denomination[i]
				for(int n = 0; n * denomination[i] <= j; n++){
					number_of_ways[i][j] += number_of_ways[i-1][j - n * denomination[i]];
				}
			}
		}
		
		//we use the last element to get the answer
		return number_of_ways[denomination.length-1][value];
	}
	
	public static void main(String[] args) {
		System.out.println(currency_combination(200));

	}

}
