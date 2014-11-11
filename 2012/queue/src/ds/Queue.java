package ds;

public class Queue {
	
	private Node head,tail;
	
	public Queue (){}
	
	public void init(char data)
	{
		head = new Node(data);
		tail = head;
	}
	
	public void push(char data)
	{
		Node temp = new Node(data);		
		tail.setNext(temp);
		tail = tail.getNext();
	}
	
	public char pop()
	{
		Node temp = head;		
		head = head.getNext();
		return temp.getData();
	}
	
	public char peek()
	{
		return head.getData();
	}
	
	public boolean empty()
	{
		if(head == null)
			return true;
		else
			return false;
	}

}
