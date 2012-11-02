package sol;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] A = {{1,2},{3,4}};
		new Solution().rotate(A);
		for(int i = 0;i<A.length;i++)
			for(int j=0;j<A.length;j++)
				System.out.println(A[i][j]);
	}

	public void rotate(int[][] matrix) {
		// Start typing your Java solution below
		// DO NOT write main() function

		if (matrix.length == 0 || matrix.length == 1) {
			return;
		} else {
			int n = matrix[0].length;
			for (int i = 0; i < (int) (n / 2); i++) {
				for (int j = 0; j < (int) (n / 2); j++) {
					int temp = matrix[i][j];
					matrix[i][j] = matrix[n - 1 - j][i];
					matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j];
					matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i];
					matrix[j][n - 1 - i] = temp;
				}
			}

			if (n % 2 != 0) {
				int index = (n - 1) / 2;
				for (int i = 0; i < (int) ((n - 1) / 2); i++) {
					int temp = matrix[index][i];
					matrix[index][i] = matrix[n - 1 - i][index];
					matrix[n - 1 - i][index] = matrix[index][n - 1 - i];
					matrix[index][n - 1 - i] = matrix[i][index];
					matrix[i][index] = temp;
				}
			}
		}

	}

}
