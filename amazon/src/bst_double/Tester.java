package bst_double;

import java.util.Random;

public class Tester {
	public static void main(String[] args)
	{
		Random r = new Random();
		
		BT bst = new BT(r.nextInt(100)); 
		
		for(int i = 0;i < 10; i++)
			bst.add(r.nextInt(100));
		
		bst.dfs(bst.getRoot());
		
		System.out.println();
		
		bst.to_link();
		
		System.out.println();
		
		bst.to_tree();
		
		bst.dfs(bst.getRoot());		
		
	}

}
