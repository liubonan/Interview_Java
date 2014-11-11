package sol;

import java.io.*;

//Time complexity of this algorithm is O(n)
//Space complexity of this algorithm is O(n) because the StringBuffer used

public class Solution {
    
    public Solution(String input) {
    	//error handler
    	if(input == null || input.isEmpty()){
    		System.out.print("");
    		return;
    	}
    	
    	int [] count = new int[input.length()*2+3];
    	StringBuffer str = new StringBuffer();
    	str.append("|");
    	for(int i = 0;i < input.length();i++){
    		str.append(input.charAt(i));
    		str.append("|");
    	}    	
    	
    	int mid = -1; 
    	int edge = -1;
    	  
		for (int i = 0; i < str.length() ; i++) {
			// the correspond position to i
			int j = 2 * mid - i; 

			if (edge > i) {
				if ((edge - i) > count[j])
					count[i] = count[j];
				else
					count[i] = edge - i;
			} else {
				count[i] = 0;
			}

			while ((i + count[i] + 1 < str.length()) && 
					(i - count[i] - 1 >= 0) &&
					str.charAt(i + count[i] + 1) == str.charAt(i - count[i] - 1 ))
				count[i]++;

			if (i + count[i] > edge) {
				mid = i;
				edge = i + count[i];
			}
		}    	 

		int max = 0;
		int max_index = 0;
		for (int i = 1; i < str.length() - 1; i++) {
			if (count[i] > max) {
				max_index = i;
				max = count[i];				
			}
		}
		
		int begin_index = (int)((max_index - max) * 0.5);
		int end_index = begin_index + max;

		System.out.print(input.substring(begin_index,end_index));    	
    }
        
    public static void main(String[] args) throws Exception {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            new Solution(br.readLine());
        } finally {
            if (br != null)
                br.close();
        }
    }
}
