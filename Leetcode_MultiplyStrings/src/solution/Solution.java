package solution;

public class Solution {
	public String multiply(String num1, String num2) {
        if(num1 == null || num2 == null || num1.length() == 0 || num2.length() == 0){
        	return "";
        }
        
        StringBuilder[] lookup = new StringBuilder[10];
        lookup[0] = new StringBuilder("0");
        for(int i = 1; i < lookup.length; i++){
        	lookup[i] = new StringBuilder();
        	int carry = 0;
        	
        	for(int j = num2.length() - 1; j >=0; j--){
        		int digit = num2.charAt(j) - '0';
        		int product = i * digit + carry;
        		carry = product / 10;
        		lookup[i].insert(0, product % 10);
        	}
        	
        	if(carry != 0){
        		lookup[i].insert(0, carry);
        	}
        }
        
        StringBuilder result = new StringBuilder();
        
        for(int i = num1.length() - 1; i >= 0; i--){
        	int digit = num1.charAt(i) - '0';
        	StringBuilder product = new StringBuilder(lookup[digit]);
        	
        	for(int j = 0; j < num1.length() - 1 - i; j++){
        		product.append('0');
        	}
        	
        	result = this.add(result, product);
        }
        
        for(int i = 0; i < result.length(); i++){
        	if(result.charAt(i) != '0' || i == result.length() - 1){
        		result.delete(0, i);
        		break;
        	}
        }
        
        return result.toString().equals("") ? "0" : result.toString();
    }
	
	private StringBuilder add(StringBuilder sb1, StringBuilder sb2){
		int carry = 0;
		StringBuilder result = new StringBuilder();
		int i = sb1.length() - 1;
		int j = sb2.length() - 1;
		
		while (i >= 0 && j >= 0){
			int sum = sb1.charAt(i--) - '0' + sb2.charAt(j--) - '0' + carry;
			carry = sum / 10;
			result.insert(0, sum % 10);
		}
		
		while(i >= 0){
			int sum = sb1.charAt(i--) - '0' + carry;
			carry = sum / 10;
			result.insert(0, sum % 10);
		}
		
		while(j >= 0){
			int sum = sb2.charAt(j--) - '0' + carry;
			carry = sum / 10;
			result.insert(0, sum % 10);
		}
		
		if(carry != 0){
			result.insert(0, carry);
		}
		
		return result;
	}
}
