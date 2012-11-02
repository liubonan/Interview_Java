package main;

import java.util.ArrayList;
import java.util.Arrays;

public class sol {

public static int threeSum(int[] num,int target) {
      
        
        Arrays.sort(num);  
        
        int closest = Integer.MAX_VALUE;
        int ssum = 0;
       
       
        
        for(int i = 0; i<num.length; i++){

        	if(i !=0 && num[i]==num[i-1])
        		continue;
        	int j = i+1;
            int k = num.length - 1;
            
            
            while(j < k){
                int part = num[i]+num[j];
                int left = target - part - num[k];
                if(left > 0){
                    
                	if(Math.abs(left) < closest ){
                		ssum = num[i]+num[j]+num[k];
                		closest = Math.abs(left);
                	}		
                	
                	
                	j++;
                	while(num[j] == num[j-1] && j<k)
                		j++;
                }
                else if(left < 0 ){
                	
                	if(Math.abs(left) < closest){
                		ssum = num[i]+num[j]+num[k];
                		closest = Math.abs(left);
                	}
                	
                    k--;
                    while(num[k] == num[k+1] && j<k)
                    	k--;
                }
                else{         
                    closest = 0;	
                    ssum = target;
                    break;
                }
            }
        }
        
        return ssum;
        
    }
    
    public static void main(String args[]){
    	int[] a={0,2,1,-3};
    	System.out.print(threeSum(a,1));
    }

}
