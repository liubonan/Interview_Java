package main;

public class main {

	public static void main(String args[]){
		LinkedList a = new LinkedList(1);
		int i =2;
		while(i<=10)
			a.insert(i++);
		
		
		Node p1 = a.getHead();
		Node p2 = p1.getNext();
		Node p3 = p2.getNext();
		p1.setNext(null);
		while(p3.getNext() != null){
			p2.setNext(p1);
			p1 = p2;
			p2 = p3;
			p3 = p2.getNext();
		}
		
		p2.setNext(p1);
		p3.setNext(p2);
		
		//p1 =  a.getHead();
		
		while(p3 != null){			
			System.out.print(p3.getData());
			p3 = p3.getNext();
		}
		
		
		
	}
}
