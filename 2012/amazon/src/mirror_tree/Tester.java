package mirror_tree;

public class Tester {
	
	public static void main(String[] args)
	{
		int[] t1 = {1, 2, 3, 4, 5,0,0, 6, 7,0, 8,1,1,1,1};
		int[] t2 = {1, 3,2,0,0,5,4,1,2,3,1,8,0,7,6};
		
		BT b1 = new BT(t1);
		BT b2 = new BT(t2);
	
		b1.dfs(b1.getRoot());
		System.out.println();
		b2.dfs(b2.getRoot());
		System.out.println();
		System.out.println(mirror.isM(b1.getRoot(), b2.getRoot()));
	}

}
