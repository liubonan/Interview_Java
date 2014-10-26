package solution;

public class Solution {
	public int canCompleteCircuit(int[] gas, int[] cost) {
        if(gas == null || cost == null || gas.length == 0 || gas.length != cost.length){
        	return -1;
        }
        
        int tank = 0;
        int index = 0;
        int sum = 0;
        
        for(int i = 0; i < gas.length; i++){
        	tank += gas[i] - cost[i];
        	sum += gas[i] - cost[i];
        	if(tank < 0){
        		tank = 0;
        		index = i + 1;
        		continue;
        	}
        }
        
        if(sum < 0){
        	return -1;
        }
        
        return index;
    }
}
