package solution;

public class Solution {
	public String countAndSay(int n) {
		if(n == 0){
			return "0";
		}
		
		StringBuilder sb;
		String prev = "1";
		
		for(int i = 1; i < n; i++){
			int j = 0;
			sb = new StringBuilder();
			int count = 0;
			char c = '0';
			
			while(j < prev.length()){
				if(c == prev.charAt(j)){
					count++;
				}
				else{
					if(j != 0){
						sb.append(count);
						sb.append(c);
					}
					count = 1;
					c = prev.charAt(j);
				}
				j++;
			}
			
			sb.append(count);
			sb.append(c);
			
			prev = sb.toString();
		}
		
		return prev;
        
    }
}
