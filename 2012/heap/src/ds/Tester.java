package ds;

public class Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxHeap maxh = new MaxHeap(1);
		maxh.delete();
		
		maxh.insert(3);
		maxh.insert(5);
		maxh.insert(6);
		maxh.insert(7);
		maxh.insert(9);
		maxh.insert(10);
		maxh.insert(12);
		
		for(int i = 0;i<10;i++)
			System.out.print(maxh.delete()+" ");
	}

}
