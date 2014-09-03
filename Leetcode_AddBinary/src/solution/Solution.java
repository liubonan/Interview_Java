package solution;

public class Solution {
	private int carry = 0;
	
	public String addBinary(String a, String b) {
		
		StringBuilder sb1 = new StringBuilder();
		
		int i = a.length() - 1, j = b.length() - 1;
		
		
			while(i >=0 && j >= 0){
				sb1.insert(0, this.addOneDigit(a.charAt(i), b.charAt(j)));
				
				i--;
				j--;
			}
			
			if(j >= 0){
				while(j >= 0){
					sb1.insert(0, this.addOneDigit('0', b.charAt(j)));
					j --;
				}
			}
			else{
				while(i >= 0){
					sb1.insert(0, this.addOneDigit(a.charAt(i), '0'));
					i--;
				}
			}
			
			if(this.carry == 1){
				sb1.insert(0, '1');
			}
			
		return sb1.toString();
    }
	
	private char addOneDigit(char a, char b){
		if(this.carry == 0){
			if(a == '0' && b == '0' ){
				return '0';
			}
			else if(a == '1' && b == '1' ){
				this.carry = 1;
				return '0';
			}
			else{
				return '1';
			}
		}
		else{
			if(a == '0' && b == '0' ){
				this.carry = 0;
				return '1';
			}
			else if(a == '1' && b == '1' ){
				return '1';
			}
			else{
				return '0';
			}
		}
	}
}
