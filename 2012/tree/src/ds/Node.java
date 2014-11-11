package ds;

public class Node {
	
	private int data;
	private int depth;
	private boolean visited;
	
	private Node left, right;
	
	public Node(int data)
	{
		this.setData(data);
		this.setLeft(null);
		this.setRight(null);
		this.setVisited(false);
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

}
