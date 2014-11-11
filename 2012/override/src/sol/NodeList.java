package sol;

import java.util.LinkedList;

public class NodeList extends LinkedList<Node> {
	
	@Override
	public boolean add(Node n){
		int i =0, j = this.size()-1;
		
		if(j < i){
			super.add(n);
			return true;
		}
		
		int value = n.getData();
		
		while(i < j){
			int mid = (i + j) /2;
			if(this.get(mid).getData() <= value){
				i = mid + 1;				
			}
			else{
				j = mid -1;
			}
		}
		
		if(this.get(i).getData() < value)
			if(i+1 < this.size())
				this.add(i+1, n);
			else
				super.add(n);
		else
			this.add(i, n);
		return true;
	}

}
