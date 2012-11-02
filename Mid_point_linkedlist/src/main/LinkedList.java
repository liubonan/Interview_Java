package main;

public class LinkedList {
	
	private Node head;
	
	public LinkedList(int data){head = new Node();head.setData(data);}
	
	public void insert(int data){
		Node temp = head;
		while(temp.getNext() != null)
			temp = temp.getNext();
		temp.setNext(new Node());
		temp.getNext().setData(data);
	}
	
	public Node getHead(){return head;}

}
