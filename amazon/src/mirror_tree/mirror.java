package mirror_tree;

import java.util.LinkedList;
import java.util.Queue;

public class mirror {

	public static boolean isM(Node c1, Node c2)
	{
		Queue<Node> q1 = new LinkedList<Node>();
		Queue<Node> q2 = new LinkedList<Node>();
		
		q1.add(c1);
		q2.add(c2);
		
		while((!q1.isEmpty()) && (!q2.isEmpty()))
		{
			Node current1 = q1.remove();
			Node current2 = q2.remove();
			
			if(current1.getData() != current2.getData())
				return false;
			
			if(current1.getLeft() != null && current2.getRight() != null)
			{
				q1.add(current1.getLeft());
				q2.add(current2.getRight());
			}
			else
			{
				if(current1.getLeft() != null || current2.getRight() != null)
				{
					return false;
				}				
			}
			
			if(current2.getLeft() != null && current1.getRight() != null)
			{
				q2.add(current2.getLeft());
				q1.add(current1.getRight());
			}
			else
			{
				if(current2.getLeft() != null || current1.getRight() != null)
				{
					return false;
				}				
			}			
		}
		
		if((!q1.isEmpty()) || (!q2.isEmpty()))
			return false;
		
		return true;
	}
}
