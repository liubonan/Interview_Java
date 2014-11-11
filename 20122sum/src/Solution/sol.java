package Solution;

import java.util.Arrays;

public class sol {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] A = {150,24,79,50,88,345,3};
		int [] B = new sol().twoSum(A,200);
		System.out.println(B[0]);
		System.out.println(B[1]);
		

	}
	
	public int[] twoSum(int[] numbers, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
		if(numbers == null || numbers.length == 0)
			return new int[2];
		
		int [] nums = numbers.clone();
		Arrays.sort(numbers);
		
		int i = 0;
		int j = numbers.length-1;
		
		while(i < j){
			if(numbers[i]+numbers[j] == target){				
				break;
			}
			else if(numbers[i]+numbers[j] < target){
				i++;
			}
			else {
				j--;
			}
		}
		
		int [] results = {-1,-1};
		for(int k = 0;k < nums.length;k++){
			if(numbers[i] == nums[k] && results[0] == -1){
				results[0] = k+1;

			}
			else if(numbers[j] == nums[k]&& results[1] == -1){
				results[1] = k+1; 
			}
		}
		Arrays.sort(results);
		return results;
        
    }

}
