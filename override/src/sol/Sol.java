package sol;

import java.util.LinkedList;

public class Sol {

	
	public static void main(String[] args) {
		NodeList list= new NodeList();
	
		list.add(new Node(2));
		list.add(new Node(3));
		list.add(new Node(1));
		list.add(new Node(4));
		
		for(int i = 0;i < list.size();i++){
			System.out.println(list.get(i).getData());
		}
		
		

	}
	
	

}
