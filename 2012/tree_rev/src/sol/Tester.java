package sol;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Tester {

	public static void main(String[] args){
		Tree t = new Tree();
		Node root = new Node(1);
		root.setLeft(new Node(2));
		root.setRight(new Node(3));
		root.getLeft().setLeft(new Node(4));
		root.getRight().setLeft(new Node(5));
		root.getRight().setRight(new Node(6));
		root.getRight().getRight().setRight(new Node(7));
		
		t.setRoot(root);
		out(t);
		System.out.println();
		t.reverse(t.getRoot());
		out(t);
	}
	
	public static void out(Tree t){
		Queue<Node> q = new LinkedList<Node>();
		q.add(t.getRoot());
		
		while(!q.isEmpty()){
			Node pop = q.remove();
			if(pop.getLeft()!= null) q.add(pop.getLeft());
			if(pop.getRight()!=null) q.add(pop.getRight());
			System.out.println(pop.getData());
		}
		
	}
}
