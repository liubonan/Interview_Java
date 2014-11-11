package main;

public class Tester {
	
	public static void main(String args[]){
		Deque test= new Deque();
		for(int i=0;i<10;i+=2){
			test.insertFirst(i);
			test.insertLast(i+1);
		}
		for(int i=0;i<5;i++){
			System.out.print(test.deleteFirst());
		}
		
		for(int i=0;i<5;i++){
			System.out.print(test.deleteLast());
		}
		
		System.out.print(test.Length());
		
	}

}
