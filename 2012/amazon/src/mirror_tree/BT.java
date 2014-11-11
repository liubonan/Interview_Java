package mirror_tree;

import java.util.LinkedList;
import java.util.Queue;

public class BT {
	private Node root;
	
	public BT(int[] data)
	{
		setRoot(new Node(data[0]));

		Queue<Node> q = new LinkedList<Node>();
		
		q.add(root);
		
		int i;
		for(i = 1; i < data.length-1; i+=2)
		{
			Node current = q.remove();
			
			Node left = new Node(data[i]);
			Node right = new Node(data[i+1]);
			
			current.setLeft(left);
			current.setRight(right);
			
			q.add(left);
			q.add(right);			
		}
		
		if(i == data.length -1)
		{
			Node current = q.remove();
			Node left = new Node(data[i]);
			current.setLeft(left);
		}
		
		q.clear();
		q.add(root);
		
		while(!q.isEmpty())
		{
			Node current = q.remove();
			
			if(current.getLeft() != null)
			{
				if(current.getLeft().getData() != 0)
				{
					q.add(current.getLeft());
				}
				else
				{
					current.setLeft(null);
				}
			}
			
			if(current.getRight() != null)
			{
				if(current.getRight().getData() != 0)
				{
					q.add(current.getRight());
				}
				else
				{
					current.setRight(null);
				}
			}
		}
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}
	
	public void dfs(Node current)
	{
		if(current.getLeft() != null)
			dfs(current.getLeft());
		if(current.getRight() != null)
			dfs(current.getRight());
		System.out.print(current.getData()+" ");
	}
	
	
}
