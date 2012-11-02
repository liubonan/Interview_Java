package sol;

public class Solution {
	
	private static boolean flag;
	
	public static String addBinary(String a, String b) {
		int ap=a.length()-1;
		int bp = b.length() - 1;
		StringBuffer sb = new StringBuffer();
		flag = false;
		while(ap>=0 && bp>=0){
			sb.append(add(a.charAt(ap), b.charAt(bp)));
			ap--;
			bp--;			
		}
		if(ap < 0 && bp <0){
			
		}
		else if(ap < 0){
			while(bp>=0){
				sb.append(add(b.charAt(bp),'0'));
				bp--;
			}
		}
		else{
			while(ap>=0){
				sb.append(add(a.charAt(ap),'0'));
				ap--;
			}
		}
		
		if(flag)
			sb.append('1');
		
		return sb.reverse().toString(); 
	}
	
	public static char add(char a, char b){
		if(flag){
			if(a == '1' && b == '1'){
				flag = true;
				return '1';
			}
			else if(a == '0' && b == '0'){
				flag = false;
				return '1';
			}
			else{
				flag = true;
				return '0';
			}
		}
		else{
			if(a == '1' && b == '1'){
				flag = true;
				return '0';
			}
			else if(a == '0' && b == '0'){
				flag = false;
				return '0';
			}
			else{
				flag = false;
				return '1';
			}
		}
	}
	
	public static void main(String args[]){
		System.out.print(addBinary("11","1"));
	}

}
