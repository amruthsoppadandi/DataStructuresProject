package graphs;


public class TestGraph {

	public static void main(String[] args) {
		GraphsImplementation graph = new GraphsImplementation();
		Node n01 =new Node(1); 
		graph.startRoute(n01, 3);
		graph.startRoute(n01, 6);
		System.out.println(graph);
	}
}
