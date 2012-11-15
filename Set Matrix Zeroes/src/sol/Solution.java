package sol;

public class Solution {

	/**
	 * Given a m x n matrix, if an element is 0, set its entire row and column
	 * to 0. Do it in place.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] A = { { 1, 1, 0, 1 }, { 1, 0, 1, 1 }, { 1, 1, 1, 1 },
				{ 1, 1, 1, 1 } };
		new Solution().setZeroes(A);
		for (int i = 0; i < A.length; i++)
			for (int j = 0; j < A.length; j++)
				System.out.println(A[i][j]);

	}

	public void setZeroes(int[][] matrix) {
		// Start typing your Java solution below
		// DO NOT write main() function
		if (matrix.length == 0)
			return;
		if (matrix[0].length == 0)
			return;

		int flag_c = -1, flag_r = -1;

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					flag_r = i;
					flag_c = j;

				}
			}
		}

		if (flag_c == -1) {
			return;
		} else {
			for (int i = 0; i < matrix.length; i++) {
				matrix[i][flag_c] = -1;
			}
			for (int i = 0; i < matrix[0].length; i++) {
				matrix[flag_r][i] = -1;
			}

			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[0].length; j++) {
					if (matrix[i][j] == 0 && i != flag_r && j != flag_c) {
						matrix[i][flag_c] = 0;
						matrix[flag_r][j] = 0;
					}
				}
			}

			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[0].length; j++) {
					if (matrix[i][flag_c] == 0) {
						matrix[i][j] = 0;
					} else if (matrix[flag_r][j] == 0) {
						matrix[i][j] = 0;
					} else {
					}
				}
			}
			for (int i = 0; i < matrix.length; i++) {
				matrix[i][flag_c] = 0;
			}
			for (int i = 0; i < matrix[0].length; i++) {
				matrix[flag_r][i] = 0;
			}

		}

	}

}
