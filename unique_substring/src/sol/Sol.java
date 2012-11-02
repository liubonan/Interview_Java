package sol;

import java.util.HashMap;

public class Sol {
	public static void main(String[] args){
		
		System.out.println(f("aaaa"));
		
	}
	
	public static String f(String str){
		
		for(int i = 1;i <= str.length(); ++i){
			MyHash h = new MyHash();
			for(int j = 0;j+i <= str.length(); ++j){
				h.put(str.substring(j, j+i));
			}
			
			String s = h.get_unique();
			if(s != null)
				return s;
		}
		
		return str;
	}
	
	

}
