package solution;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Solution {

	public List<List<String>> findLadders(String start, String end, Set<String> dict) {
		List<List<String>> result = new LinkedList<List<String>>();
		
		
		if(start == null || end == null || dict == null){
			return result;
		}
		
		Queue<List<List<String>>> queue = new LinkedList<List<List<String>>>();
		List<List<String>> startList = new LinkedList<List<String>>();
		List<String> startSol = new LinkedList<String>();
		startSol.add(start);
		startList.add(startSol);
		
		queue.add(startList);
		boolean found = false;
		HashSet<String> visited = new HashSet<String>();
		while(!queue.isEmpty()){
			int size = queue.size();
			HashMap<String, List<List<String>>> levelVisited = new HashMap<String, List<List<String>>>();
			
			for(int i = 0; i < size; i++){
				List<List<String>> level = queue.remove();
				char[] str = level.get(0).get(level.get(0).size() - 1).toCharArray();
				
				for(int m = 0; m < str.length; m++){
					char current = str[m];
					for(int n = 0; n < 26; n++){
						if('a' + n == current){
							continue;
						}
						
						str[m] = (char)('a' + n);
						String strCurr = String.valueOf(str);
						
						if(strCurr.equals(end)){
							for(int r = 0; r < level.size(); r++){
								List<String> rst = new LinkedList<String>(level.get(r));
								rst.add(end);
								result.add(rst);
								found = true;
							}
						}
						
						if(dict.contains(strCurr) && !visited.contains(strCurr)){
							List<List<String>> node = null;
							if(levelVisited.containsKey(strCurr)){
								node = levelVisited.get(strCurr);
								for(int r = 0; r < level.size(); r++){
									List<String> rst = new LinkedList<String>(level.get(r));
									rst.add(strCurr);
									node.add(rst);
								}
							}
							else{
								node = new LinkedList<List<String>>();
								for(int r = 0; r < level.size(); r++){
									List<String> rst = new LinkedList<String>(level.get(r));
									rst.add(strCurr);
									node.add(rst);
								}
								queue.offer(node);
							}

							levelVisited.put(strCurr, node);
						}
					}
					
					str[m] = current;
				}
			}
			
			if(found){
				return result;
			}
			
			visited.addAll(levelVisited.keySet());
		}
		
        return result;
    }
}
