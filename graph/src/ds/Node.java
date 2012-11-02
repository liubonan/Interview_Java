package ds;

import java.util.ArrayList;
import java.util.List;

public class Node {
	private int data;
	private List<Node> children;
	private boolean visited;
	
	public Node(int data)
	{
		this.setData(data);
		children = new ArrayList<Node>();
		setVisited(false);
	}
	
	public List<Node> getChildren()
	{
		return children;
	}
	
	public void addChild(Node newchild)
	{
		children.add(newchild);
	}
	
	public void deleteChild(Node child)
	{
		if(!children.isEmpty())
			children.remove(child);
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

}
