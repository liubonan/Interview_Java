package solution;

import java.util.*;

public class Solution {
	public List<Integer> findSubstring(String S, String[] L) {
        if(S == null || S.length() == 0){
        	return new LinkedList<Integer>();
        }
        
        if(L == null || L.length == 0){
        	return new LinkedList<Integer>();
        }
        
        int k = L[0].length();
        List<Integer> result = new LinkedList<Integer>();
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        HashMap<String, Integer> currmap = new HashMap<String, Integer>();
        
        for(int i = 0; i < L.length; i++){
        	if(map.containsKey(L[i])){
        		map.put(L[i], map.get(L[i]) + 1);
        	}
        	else{
        		map.put(L[i], 1);
        	}
        }
        
        currmap = new HashMap<String, Integer>(map); 
        int rst = 0;
        int i = 0;
        while(i < S.length() - k + 1){
        	String curr = S.substring(i, i + k);
        	if(currmap.containsKey(curr)){
        		currmap.put(curr, currmap.get(curr) - 1);
        		i += k;
        		
        		if(rst + k *L.length == i){
        			if(this.isResult(currmap)){
            			result.add(rst);
            		}
        			
        			String tmp = S.substring(rst, rst + k);
        			currmap.put(tmp, currmap.get(tmp) + 1);
        			rst += k;
        		}
        	}
        	else{
        		i = rst + 1;
        		currmap = new HashMap<String, Integer>(map); 
        		rst = i;
        	}
        }
        
        if(rst + k *L.length == i && this.isResult(currmap)){
			result.add(rst);
		}
        
        return result;
    }
	
	private boolean isResult(HashMap<String, Integer> currmap){
		for(String str : currmap.keySet()){
			if(currmap.get(str) != 0){
				return false;
			}
		}
		
		return true;
	}
}
