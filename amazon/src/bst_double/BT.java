package bst_double;

import java.util.Stack;

public class BT {
	private Node root;
	private Node head;
	
	public BT(int data)
	{
		setRoot(new Node(data));		
	}
	
	public void add(int data)
	{
		Node current = root;
		
		
		while(current != null)
		{
			
			if(current.getData() > data)
			{
				if(current.getLeft() != null)
					current = current.getLeft();
				else
				{
					Node temp = new Node(data);
					current.setLeft(temp);
					break;
				}
			}
			else
			{
				if(current.getRight() != null)
					current = current.getRight();
				else
				{
					Node temp = new Node(data);
					current.setRight(temp);
					break;
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
		if(current == null)
			return;
		
		if(current.getLeft() != null)
			dfs(current.getLeft());
		System.out.print(current.getData()+" ");
		if(current.getRight() != null)
			dfs(current.getRight());
		
	}
	
	public void to_link()
	{
		Stack<Node> s =new Stack<Node>();
		
		Node pre = null;
		Node current = null;		
		s.push(root);
		
		while(!s.isEmpty())
		{
			current = s.pop();
			Node right = current.getRight();
			Node left = current.getLeft();
			
			if(left == null  && right == null)
			{
				current.setLeft(pre);
				
				if(pre == null)
					head = current;
				else
					pre.setRight(current);
				
				pre = current;
			}
			else
			{
				if(right != null)
					s.push(right);
				
				current.setRight(null);
				current.setLeft(null);
				
				s.push(current);
				
				if(left != null)
					s.push(left);
			}
			
			
			
		}
		
		current = head;
		
		while(current != null)
		{
			System.out.print(current.getData()+" ");
			current = current.getRight();
		}
		
		System.out.println();
		
		while(pre != null)
		{
			System.out.print(pre.getData()+" ");
			pre = pre.getLeft();
		}
	}
	
	public void to_tree()
	{
		Node next = head;
		int count = 0;
		
		while(next.getRight() != null)
		{			
			count ++;
			next = next.getRight();
		}
		
		
		root = re_tree(0, count, head, next);
		
		System.out.println(root.getData());
		System.out.println(root.getLeft().getData());
		System.out.println(root.getRight().getData());
		
	}
	
	private Node re_tree(int begin, int end, Node b, Node e)
	{	

		
		
		if(end - begin == 1)
		{
			b.setLeft(null);
			b.setRight(null);
			e.setLeft(b);
			e.setRight(null);
			return e;
		}
		else
		{
			if(begin == end)
			{
					b.setLeft(null);
					b.setRight(null);
					return b;
			}
			else
			{
				
				int middle  = ((begin + end)/2);
				
				Node m = b;
				
				int i = middle - begin - 1;
				
				while(i > 0)
				{
					i --;
					m = m.getRight();
				}
				
				Node m2 = m.getRight().getRight();
				
				m.setLeft(re_tree(begin, middle-1, b, m));
				
				
				
				m.setRight(re_tree(middle+1, end, m2, e));
				
				return m;
			}
			
		}
	}
	
	
}
