package sol;

import java.util.ArrayList;

public class Solution {

	/**
	 * Given a set of non-overlapping intervals, insert a new interval into the
	 * intervals (merge if necessary). You may assume that the intervals were
	 * initially sorted according to their start times.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Interval> A = new ArrayList<Interval>();
		A.add(new Interval(1,5));
		//A.add(new Interval(6,7));
		//A.add(new Interval(8,9));
		A = new Solution().insert(A, new Interval(6,8));
		
		for(Interval i : A){
			System.out.println(i.start + " " + i.end);
		}

	}
	public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        // Start typing your Java solution below
        // DO NOT write main() function
		
		if(intervals == null)
			return null;
		if(intervals.size() == 0){
			ArrayList<Interval> temp = new ArrayList<Interval>();
			temp.add(newInterval);
			return temp;
		}
		if(newInterval == null){
			return intervals;
		}
		
		int left = 0, right = intervals.size() -1;
		
		while(left < right){
			int mid = (left + right)/2;
			
			if(newInterval.start < intervals.get(mid).start){
				right = mid - 1;
			}
			else if(newInterval.start > intervals.get(mid).start){
				left = mid + 1;
			}
			
		}
		
		int eleft = 0, eright = intervals.size() -1;
		
		while(eleft < eright){
			int emid = (eleft + eright)/2;
			
			if(newInterval.end < intervals.get(emid).start){
				eright = emid - 1;
			}
			else if(newInterval.end > intervals.get(emid).start){
				eleft = emid + 1;
			}
			
		}
		
		if(newInterval.start > intervals.get(left).end){
			for(int i = left+1;i<=eleft-1;i++)
				intervals.remove(left+1);
			intervals.add(left+1, newInterval);
			if(left+2 < intervals.size() && newInterval.end == intervals.get(left+2).start){
				newInterval.end = intervals.get(left+2).end;
				intervals.remove(left+2);
			}
		}
		else{
			newInterval.start = intervals.get(left).start;
			for(int i = left;i<=eleft-1;i++)
				intervals.remove(left);
			intervals.add(left, newInterval);
			if(left+1 < intervals.size() && newInterval.end == intervals.get(left+1).start){
				newInterval.end = intervals.get(left+1).end;
				intervals.remove(left+1);
			}
		}
		
		
			
        return intervals;
    }

}


