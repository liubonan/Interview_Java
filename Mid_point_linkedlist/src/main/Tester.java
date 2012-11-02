package main;

public class Tester {
	
	public static void main(String args[]){
		LinkedList a = new LinkedList(1);
		int i =2;
		while(i<=11)
			a.insert(i++);
		
		Node p1 = a.getHead();
		Node p2 = a.getHead().getNext();
		
		while(p2.getNext()!=null && p2.getNext().getNext()!=null){
			p1=p1.getNext();
			p2=p2.getNext().getNext();
		}
		
		if(p2.getNext() != null)
			p1=p1.getNext();
		else{
			System.out.println(p1.getData());
			p1= p1.getNext();
		}
		
		System.out.print(p1.getData());
	}

}
