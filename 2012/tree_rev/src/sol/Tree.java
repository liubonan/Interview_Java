package sol;

public class Tree {
	
	private Node root;

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}
	
	public void reverse(Node n){
		if(n.getLeft() == null && n.getRight() == null){
			return;
		}
		else if(n.getLeft() == null){
			reverse(n.getRight());
			n.setLeft(n.getRight());
			n.setRight(null);
		}
		else if(n.getRight() == null){
			reverse(n.getLeft());
			n.setRight(n.getLeft());
			n.setLeft(null);
		}
		else{
			reverse(n.getLeft());
			reverse(n.getRight());
			Node temp = n.getLeft();
			n.setLeft(n.getRight());
			n.setRight(temp);
		}
	}

}
