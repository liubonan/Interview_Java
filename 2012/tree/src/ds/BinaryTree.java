package ds;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {
	
	private Node root;

	public BinaryTree(int data)
	{
		Node temp = new Node(data);		
		setRoot(temp);
	}
	
	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}
	
	public void add_it(int data)
	{
		Node current = root;
		Node prev=null;
		boolean childflag = false;
		
		while(current != null)
		{
			prev = current;
			
			if(data <= current.getData())
			{
				current = current.getLeft();
				childflag = true;
			}
			else
			{
				current = current.getRight();		
				childflag = false;
			}
		}
		
		current=new Node(data);
		
		if(childflag)
			prev.setLeft(current);
		else
			prev.setRight(current);	
		
	}
	
	public void add_re(int data, Node current)
	{
		if(data <= current.getData())
		{
			if(current.getLeft() == null)
			{
				Node temp = new Node(data);
				current.setLeft(temp);
			}
			else
			{
				add_re(data,current.getLeft());				
			}
		}
		else
		{
			if(current.getRight() == null)
			{
				Node temp = new Node(data);
				current.setRight(temp);
			}
			else
			{
				add_re(data, current.getRight());
			}
			
		}
	}
	
	public void dfs_re(Node current)
	{
		if((current.getLeft() == null)&&(current.getRight() == null))
			System.out.print(current.getData() + " ");
		else
		{
			if(current.getLeft() != null)
				dfs_re(current.getLeft());
			
			if(current.getRight() != null)
				dfs_re(current.getRight());
			
			System.out.print(current.getData() + " ");
		}
	}
	
	
	
	public void bfs()
	{
		Queue<Node> q = new LinkedList<Node>();
		
		q.add(root);
		
		while(!q.isEmpty())
		{
			Node temp = q.remove();
			if(temp.getLeft()!=null)
				q.add(temp.getLeft());
			if(temp.getRight()!=null)
				q.add(temp.getRight());
			System.out.print(temp.getData() + " ");
		}
		
	}
	
	public void dfs_it()
	{
		Stack<Node> s = new Stack<Node>();
		
		s.push(root);
		
		while(!s.isEmpty())
		{
			Node temp = s.pop();
			
			if(((temp.getLeft() == null)&&(temp.getRight() == null)) || (temp.isVisited()))
				System.out.print(temp.getData() + " ");
			else
			{
				
				if(temp.getRight() == null)
				{
					Node left = temp.getLeft();
					temp.setVisited(true);
					
					s.push(temp);
					s.push(left);
					
				}
				else
				{
					if(temp.getLeft() == null)
					{
						Node right = temp.getRight();
						temp.setVisited(true);
						
						s.push(temp);
						s.push(right);
					}
					else
					{
						Node left = temp.getLeft();
						Node right = temp.getRight();
						temp.setVisited(true);
						s.push(temp);
						s.push(right);
						s.push(left);
					}
				}
			}
		}
		
	}

}
