package solution;

import java.util.*;

public class Solution {
	public int maxPoints(Point[] points) {
		if(points == null || points.length == 0){
        	return 0;
        }
        
        int max = 1;
        
        for(int i = 0; i < points.length; i++){
        	HashMap<Double, Integer> map = new HashMap<Double, Integer>();
        	
        	int samePoint = 1;
        	
        	for(int j = i + 1; j < points.length; j++){
        		int xDiff = points[j].x - points[i].x;
        		int yDiff = points[j].y - points[i].y;
        		double k = 0;
        		
        		if(xDiff == 0 && yDiff == 0){
        			samePoint++;
        			continue;
        		}
        		else if(xDiff == 0){
        			k = Double.MAX_VALUE;
        		}
        		else if(yDiff == 0){
        			k = 0;
        		}
        		else{
        			k = yDiff / (double)xDiff;
        		}
        		
        		if(map.containsKey(k)){
        			map.put(k, map.get(k) + 1);
        		}
        		else{
        			map.put(k, 1);
        		}
        	}
        	
        	max = Math.max(max, samePoint);
        	for(int v : map.values()){
        		max = Math.max(max, samePoint + v);
        	}
        }
        
        return max;
    }
}
