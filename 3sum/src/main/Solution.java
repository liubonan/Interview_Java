package main;

import java.util.ArrayList;
import java.util.Arrays;


public class Solution {
	
	/*
	 * Given an array S of n integers, are there elements a, b, c in S such that
	 * a + b + c = 0? Find all unique triplets in the array which gives the sum
	 * of zero.
	 */
    public static ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        
        ArrayList<ArrayList<Integer>> results = new ArrayList<ArrayList<Integer>>();
        
        Arrays.sort(num);  
       
        
        for(int i = 0; i<num.length; i++){

        	if(i !=0 && num[i]==num[i-1])
        		continue;
        	int j = i+1;
            int k = num.length - 1;
            
            
            while(j < k){
                int part = num[i]+num[j];
                if(part+num[k] < 0){
                    
                	j++;
                	while(num[j] == num[j-1] && j<k)
                		j++;
                }
                else if(part + num[k] > 0 ){
                    k--;
                    while(num[k] == num[k+1] && j<k)
                    	k--;
                }
                else{         
                    
                    	ArrayList<Integer> result = new ArrayList<Integer>();
                        result.add(num[i]);
                        result.add(num[j]);
                        result.add(num[k]);
                        
                       //if(h.put(result, "") == null)
                       results.add(result);                
                    
                        j++;
                        while(num[j] == num[j-1] && j<k)
                    		j++;
                        k--;
                        while(num[k] == num[k+1] && j<k)
                        	k--;
                }
            }
        }
        
        return results;
        
    }
    
    public static void main(String args[]){
    	int[] a={-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6};
    	//int[] a={-1,0,0,0,1};
    	ArrayList<ArrayList<Integer>> results =threeSum(a);
    	for(ArrayList<Integer> s:results){
    		System.out.println(s.get(0)+" "+s.get(1)+" "+s.get(2));
    	}
    }
}
