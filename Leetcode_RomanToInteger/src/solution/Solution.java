package solution;

import java.util.Hashtable;

public class Solution {
	
	public int romanToInt(String s) {
		if(s == null || s.length() == 0){
			return 0;
		}
		
		int result = 0;
		
		Hashtable<Character, Integer> romanIntegerMap = new Hashtable<Character, Integer>();
		
		romanIntegerMap.put('I', 1);
		romanIntegerMap.put('V', 5);
		romanIntegerMap.put('X', 10);
		romanIntegerMap.put('L', 50);
		romanIntegerMap.put('C', 100);
		romanIntegerMap.put('D', 500);
		romanIntegerMap.put('M', 1000);
		
		int prev = 0;
		for(int i = 0; i < s.length(); i++){
			if(prev == 0){
				prev = romanIntegerMap.get(s.charAt(i));
			}
			else{
				int current = romanIntegerMap.get(s.charAt(i));
				if(current > prev){
					result -= prev;
					result += current;
					prev = 0;
				}
				else{
					result += prev;
					prev = current;
				}
			}
		}
		
		return result + prev;
    }
}
