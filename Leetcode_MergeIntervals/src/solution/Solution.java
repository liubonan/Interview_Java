package solution;

import java.util.*;

public class Solution {
	public List<Interval> merge(List<Interval> intervals) {
		if(intervals == null || intervals.size() == 0){
			return intervals;
		}
		
		List<Interval> results = new LinkedList<Interval>();
        Collections.sort(intervals, intervalComp);
        
        int start = intervals.get(0).start;
        int end = intervals.get(0).end;
        
        for(int i = 1; i < intervals.size(); i++){
        	if(intervals.get(i).start > end){
        		results.add(new Interval(start, end));
        		start = intervals.get(i).start;
        		end = intervals.get(i).end;
        	}
        	else if(intervals.get(i).end > end){
        		end = intervals.get(i).end;
        	}
        	else{
        		continue;
        	}
        }
        
        results.add(new Interval(start, end));
        
        return results;
    }
	
	Comparator<Interval> intervalComp = new Comparator<Interval>(){
		public int compare(Interval a, Interval b){
			if(a.start < b.start){
				return -1;
			}
			else if(a.start > b.start){
				return 1;
			}
			else{
				return 0;
			}
		}
	};
}
