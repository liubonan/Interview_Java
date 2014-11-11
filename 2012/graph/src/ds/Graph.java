package ds;

import java.util.LinkedList;
import java.util.Queue;

public class Graph {
	private Node root;
	
	public Graph(int data)
	{
		root = new Node(data);
	}
	
	public Node getRoot()
	{
		return root;
	}
	
	public void init(int[] data)
	{
		Node temp1 =new Node(data[0]);
		Node temp2 =new Node(data[1]);
		Node temp3 =new Node(data[2]);
		
		root.addChild(temp1);
		root.addChild(temp2);
		root.addChild(temp3);
		
		temp1.addChild(root);
		temp2.addChild(root);
		temp3.addChild(root);
		
		temp1.addChild(temp2);
		temp2.addChild(temp1);
		
		temp3.addChild(temp2);
		temp2.addChild(temp3);
		
		Node temp4 =new Node(data[3]);
		Node temp5 =new Node(data[4]);
		
		temp1.addChild(temp4);
		temp4.addChild(temp1);		
		temp5.addChild(temp2);
		temp2.addChild(temp5);
		
		temp4.addChild(temp5);		
		temp5.addChild(temp4);
		
		Node temp6 =new Node(data[5]);
		
		temp6.addChild(temp5);		
		temp5.addChild(temp6);
		
	}
	
	public Node dfs_search(int data, Node current)
	{
		if(current.isVisited())
		{
			return null;
		}
		else
		{
			current.setVisited(true);
			System.out.print(current.getData() + " ");
			if(current.getData() == data)
			{
				return current;
			}
			else
			{
				if(current.getChildren().isEmpty())
				{
					return null;
				}
				else
				{
					for(Node n : current.getChildren())
					{
						Node temp = dfs_search(data, n);
						if(temp != null)
							return temp;
					}
					
					return null;
				}
			}
		}
		
	}
	
	public void bfs()
	{
		Queue<Node> q = new LinkedList<Node>();
		
		root.setVisited(true);
		q.add(root);
		
		while(!q.isEmpty())
		{
			Node temp = q.remove();
			System.out.print(temp.getData() + " ");
			
			for(Node n : temp.getChildren())
			{
				if(!n.isVisited())
				{
					n.setVisited(true);
					q.add(n);
				}
			}
		}
		
	}

}
