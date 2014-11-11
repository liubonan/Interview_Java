package main;

public class Deque {
		private Node first;
		private Node last;
		private int length;
		
		public Deque(){
			first = null;
			last = null;
			length = 0;
		}
		
		public void insertFirst(int data){
			Node temp = this.first;
			this.first=new Node();
			this.first.setData(data);
			this.first.setNext(temp);

			
			if(this.length == 0){
				this.last = this.first;
			}
			else{
				temp.setPrev(this.first);
			}
			this.length++;	
			
		}
		
		public int deleteFirst(){
			if(this.length <= 0){
				return Integer.MIN_VALUE;
			}
			int data = this.first.getData();
			this.first = this.first.getNext();
			
			if(this.length == 1){
				this.last = null;
			}
			else{
				this.first.setPrev(null);
			}
			this.length--;
			return data;
		}
		
		public void insertLast(int data){
			Node temp = this.last;
			this.last = new Node();
			this.last.setData(data);
			this.last.setPrev(temp);
			
			
			if(this.length == 0){
				this.first = this.last;
			}
			else{
				temp.setNext(this.last);
			}
			this.length++;
		}
		
		public int deleteLast(){
			if(this.length <=0){
				return Integer.MIN_VALUE;
			}
			int data = this.last.getData();
			this.last = this.last.getPrev();
			
			if(this.length == 1){
				this.first = null;
			}
			else{
				this.last.setNext(null);
			}
			this.length--;
			return data;
		}
		
		public int Length(){
			return this.length;
		}
}
