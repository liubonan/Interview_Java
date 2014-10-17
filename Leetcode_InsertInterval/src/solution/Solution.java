package solution;

import java.util.*;

public class Solution {
	public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        if(intervals == null || newInterval == null){
        	return intervals;
        }
        
        int start = Integer.MIN_VALUE;
        int end = Integer.MIN_VALUE;
        List<Interval> results = new LinkedList<Interval>();
        
        for(int i = 0; i < intervals.size(); i++){
        	
        	if(start == Integer.MIN_VALUE){
        		if(newInterval.start > intervals.get(i).end){
            		results.add(intervals.get(i));
            	}
        		else if(newInterval.end >= intervals.get(i).start){
            		start = Math.min(newInterval.start, intervals.get(i).start);
            		end = Math.max(newInterval.end, intervals.get(i).end);
        		}
        		else{
        			results.add(newInterval);
        			start = intervals.get(i).start;
        			end = intervals.get(i).end;
        		}
        	}
        	else{
        		if(end < intervals.get(i).start){
        			results.add(new Interval(start, end));
        			start = intervals.get(i).start;
        			end = intervals.get(i).end;
        		}
        		
        		end = Math.max(newInterval.end, intervals.get(i).end);
        	}
        }
        
        if(start == Integer.MIN_VALUE){
        	results.add(newInterval);
        }
        else{
        	results.add(new Interval(start, end));
        }
        
        return results;
    }
}
