package solution;

import java.util.*;

public class Solution {
	private HashSet<ArrayList<Integer>> result = new HashSet<ArrayList<Integer>>();
	public List<List<Integer>> fourSum(int[] num, int target) {
		if(num == null || num.length < 4){
        	return new LinkedList<List<Integer>>(result);
        }
		
		ArrayList<SumItem> sum = new ArrayList<SumItem>();
		
        for(int i = 0; i < num.length - 1; i++){
        	for(int j = i + 1; j < num.length; j++){
        		sum.add(new SumItem(num[i], num[j], i, j));
        	}
        }
        
        Collections.sort(sum, sumComp);
        
        int i = 0, j = sum.size() - 1;
        
        while(i < j){
        	if(sum.get(i).sum + sum.get(j).sum == target){
        		
        		int ii = i;
        		int jj = j;
        		while(ii < jj && sum.get(ii).sum == sum.get(i).sum){

            		jj = j;
        			while(ii < jj && sum.get(jj).sum == sum.get(j).sum){
            			this.addResult(sum.get(ii), sum.get(jj));
            			jj--;
            		}
        			ii++;
        		}
        		
        		i = ii;
        		j = jj;
        	}
        	else if(sum.get(i).sum + sum.get(j).sum < target){
        		i++;
        	}
        	else{
        		j--;
        	}
        }
        
        return new LinkedList<List<Integer>>(result);
    }
	
	private void addResult(SumItem item1, SumItem item2){
		ArrayList<Integer> rst = new ArrayList<Integer>();
		rst.add(item1.val1);
		rst.add(item1.val2);
		rst.add(item2.val1);
		rst.add(item2.val2);
		Collections.sort(rst);
		
		if(!this.result.contains(rst) &&
				item1.index1 != item2.index1 &&
				item1.index1 != item2.index2 &&
				item1.index2 != item2.index1 &&
				item1.index2 != item2.index2){
			this.result.add(rst);
		}
	}
	
	private class SumItem{
		int sum;
		int val1;
		int val2;
		int index1;
		int index2;
		
		SumItem(int val1, int val2, int index1, int index2){
			this.sum = val1 + val2;
			this.val1 = val1;
			this.val2 = val2;
			this.index1 = index1;
			this.index2 = index2;
		}
	}
	
	Comparator<SumItem> sumComp = new Comparator<SumItem>(){
		public int compare(SumItem s1, SumItem s2){
			return s1.sum - s2.sum;
		}
	};
}
