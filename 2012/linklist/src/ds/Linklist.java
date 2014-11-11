package ds;

public class Linklist {
	
	private Node header=null;
	private Node tail=null;
	
	public Linklist(){}
	
	public void add(int data)
	{
		if(header==null)
		{
			Node newnode = new Node();
			newnode.setData(data);
			newnode.setNext(null);
			header=newnode;
			tail = newnode;
		}
		else
		{
			Node newnode = new Node();
			newnode.setData(data);
			newnode.setNext(null);
			tail.setNext(newnode);
			tail = tail.getNext();
		}		
		
	}
	
	public int getdata(int index)
	{
		Node temp=header;
		for(int i=0;i<index;i++)
		{
			temp= temp.getNext();
		}
		return temp.getData();
	}
	
	public void deletehead()
	{
		header = header.getNext();
	}
	
	public void deletetail()
	{
		Node temp = header;
		while(temp.getNext() != tail)
			temp=temp.getNext();
		tail=temp;
		tail.setNext(null);		
	}
	
	public void delete(int data)
	{
		Node temp=header;
		while(temp.getNext().getData() != data)
			temp=temp.getNext();
		temp.setNext(temp.getNext().getNext());
	}

}
