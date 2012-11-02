package sol;

public class Node {
	private int data;
	private String description;
	
	public Node(int data){
		this.data = data;
		this.description = "This is " + data + ".";
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
