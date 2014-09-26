package solution;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Solution {

	public int ladderLength(String start, String end, Set<String> dict) {
		
		if(start == null || end == null || dict == null){
			return 0;
		}
		
		Queue<String> queue = new LinkedList<String>();
		queue.add(start);
		int level = 1;
		
		while(!queue.isEmpty()){
			int size = queue.size();
			
			for(int i = 0; i < size; i++){
				StringBuilder str = new StringBuilder(queue.remove());
				
				for(int m = 0; m < str.length(); m++){
					char current = str.charAt(m);
					for(int n = 0; n < 26; n++){
						if('a' + n == current){
							continue;
						}
						
						str.setCharAt(m, (char)('a' + n));
						
						if(str.toString().equals(end)){
							return level + 1;
						}
						
						if(dict.contains(str.toString())){
							queue.offer(str.toString());
							dict.remove(str.toString());
						}
					}
					
					str.setCharAt(m, current);
				}
			}
			
			level++;
		}
		
		
        return 0;
    }
}
