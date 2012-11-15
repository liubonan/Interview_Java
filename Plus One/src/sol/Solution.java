package sol;

public class Solution {

	/**
	 * Given a number represented as an array of digits, plus one to the number.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { 9 };
		for (int num : new Solution().plusOne(A))
			System.out.print(num);

	}

	public int[] plusOne(int[] digits) {
		// Start typing your Java solution below
		// DO NOT write main() function

		if (digits.length == 0) {
			digits = new int[1];
			digits[0] = 1;
			return digits;
		}

		int addition_flag = 0;

		digits[digits.length - 1] += 1;
		for (int i = digits.length - 1; i >= 0; i--) {
			digits[i] += addition_flag;
			if (digits[i] >= 10) {
				digits[i] -= 10;
				addition_flag = 1;
			} else
				addition_flag = 0;
		}

		if (addition_flag == 1) {
			int length = digits.length;
			digits = new int[length + 1];
			digits[0] = 1;
			for (int i = 1; i < digits.length; i++)
				digits[i] = 0;
		}

		return digits;
	}

}
