package main;

public class Tester {
	private static int[] data = { 5, 3, 2, 6, 1, 7, 9, 8 };

	public static void main(String args[]) {

		System.out.println(kth(7));

	}

	public static int kth(int k) {
		int low = 0;
		int high = data.length - 1;
		int index = partition(low, high);

		while (index != k - 1) {
			if (k - 1 > index) {
				low = index + 1;
				index = partition(low, high);
			} else {
				high = index - 1;
				index = partition(low, high);
			}
		}
		return data[index];
	}

	public static int partition(int low, int high) {
		int temp = data[low];
		int i = low + 1;
		int j = high;

		while (i < j) {
			while (data[i] < temp && i != j)
				i++;
			if (i == j)
				break;
			while (data[j] > temp && i != j)
				j--;
			if (i == j)
				break;
			int t = data[i];
			data[i] = data[j];
			data[j] = t;
		}

		if (data[i] < temp) {
			data[low] = data[i];
			data[i] = temp;
			return i;
		} else {
			data[low] = data[i - 1];
			data[i - 1] = temp;
			return i - 1;
		}

	}

}
