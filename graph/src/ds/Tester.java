package ds;

public class Tester {
	
	public static void main(String[] args)
	{
		Graph graph = new Graph(1);
		
		int [] nodes = {2,5,3,4,6,7};
		
		graph.init(nodes);
		
		graph.dfs_search(3, graph.getRoot());
		//graph.bfs();
		
	}
	
	
	
	

	

}
