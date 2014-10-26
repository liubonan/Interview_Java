package solution;

import java.util.*;

public class Solution {
	public String getPermutation(int n, int k) {
        if(n == 0){
        	return null;
        }
        
        ArrayList<Integer> list = new ArrayList<Integer>(n);
        k--;
        int group = 1;
        for(int i = 0; i < n; i++){
        	list.add(i + 1);
        	group *= (i + 1);
        }
        
        StringBuilder sb = new StringBuilder();
        while(!list.isEmpty()){
        	group /= n;
        	sb.append(list.get(k / group));
        	list.remove(k / group);
        	k = k % group;
        	n--;
        }
        
        return sb.toString();
    }
}
