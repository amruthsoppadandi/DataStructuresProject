package graphs;


public class TestGraph {

	public static void main(String[] args) {
		GraphsImplementation graph = new GraphsImplementation();
		Node n01 =new Node(1); 
		Node n02 =new Node(6);
		Node n03=new Node(10);
		graph.startRoute(n01, 3);
		graph.startRoute(n01, 6);
		graph.startRoute(n02, 10);
		graph.startRoute(n03, 60);
		graph.startRoute(n02, 33);
		graph.startRoute(n03, 61);
		System.out.println(graph);
		graph.print(n01);
	}
}
