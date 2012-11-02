package ds;

public class Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree t = new BinaryTree(5);
		
		t.add_re(6,t.getRoot());
		t.add_re(7,t.getRoot());
		t.add_re(2,t.getRoot());
		t.add_re(3,t.getRoot());
		t.add_re(1,t.getRoot());
		
		t.add_it(8);
		t.add_it(10);
		t.add_it(4);
		t.add_it(9);
		
		t.dfs_re(t.getRoot());
		
		System.out.println();
		t.dfs_it();
		
		System.out.println();
		t.bfs();
	}

}
