package solution;

public class Solution {
	public int canCompleteCircuit(int[] gas, int[] cost) {
        if(gas == null || cost == null || gas.length == 0 || gas.length != cost.length){
        	return -1;
        }
        
        int tank = 0;
        int index = 0;
        
        for(int i = 0; i < gas.length; i++){
        	tank += cost[i] - gas[i];
        	if(tank < 0){
        		tank = 0;
        		index = i + 1;
        		continue;
        	}
        }
        
        if(index == gas.length){
        	return -1;
        }
        
        return index;
    }
}
