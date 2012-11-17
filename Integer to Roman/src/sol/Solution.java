package sol;

public class Solution {

	/**
	 * Given an integer, convert it to a roman numeral.
	 * 
	 * Input is guaranteed to be within the range from 1 to 3999.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Solution().intToRoman(3333));
	}
	
	public String intToRoman(int num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        String [][] digit = 
        	{{"","M","MM","MMM"/*,"_IV","_V","_VI","_VII","_VIII","_IX"*/}
        	,{"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"}
        	,{"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"}
        	,{"","I","II","III","IV","V","VI","VII","VIII","IX"}};
        
        if(num <= 0){
        	return "";
        }
        StringBuilder str = new StringBuilder();
       
        int p = 3;
        while(num > 0){
        	int value = num % 10;
        	num /= 10;
        	str.insert(0, digit[p--][value]);
        }
        return str.toString();
    }

}
